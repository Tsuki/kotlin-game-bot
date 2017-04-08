package com.sukitsuki.bot

import com.sukitsuki.bot.jooq.game.Tables.USER
import com.sukitsuki.telegram.TelegramHoopingBot
import com.sukitsuki.telegram.TelegramPollingBot
import com.sukitsuki.telegram.TelegramProperties
import com.sukitsuki.telegram.entities.Message
import com.sukitsuki.telegram.entities.Update
import com.sukitsuki.telegram.handler.AbstractUpdateVisitor
import com.sukitsuki.telegram.handler.VisitorUpdateHandler
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import mu.KotlinLogging
import okhttp3.logging.HttpLoggingInterceptor.Level
import org.joda.time.DateTime
import org.joda.time.Period
import org.joda.time.format.PeriodFormat
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.impl.DefaultConfiguration


private val logger = KotlinLogging.logger {}
fun main(args: Array<String>) {

    val startTime = DateTime()
    val properties = TelegramProperties()
    val config = HikariConfig(properties.readProperties("hikari.properties"))
    val dataSource = HikariDataSource(config)

    logger.info { properties }
    val bot = when {
        properties.webHook -> TelegramHoopingBot.create(properties = properties, logLevel = Level.NONE)
        else -> TelegramPollingBot.create(properties = properties)
    }

    val configuration = DefaultConfiguration()
            .set(dataSource)
            .set(SQLDialect.POSTGRES)
    val using: DSLContext = DSL.using(configuration)
    bot.listen(properties.lastId, VisitorUpdateHandler(visitor = object : AbstractUpdateVisitor() {
        override fun visitText(update: Update, message: Message, text: String): Boolean {
            if (update.message != null) {
                val to = update.message.chat.firstName ?: update.message.chat.title
                val name = update.message.from?.firstName
                val type = update.message.chat.type
                logger.info("Receive  $text from $name in $to $type")
            }
            when (text) {
                "/start" -> {
                    val userRecord = using.newRecord(USER)
                    userRecord.id = update.message?.from?.id?.toInt()
                    using.insertInto(USER).set(userRecord).onDuplicateKeyIgnore().execute()
                    sendText(update, "user started")
                }
                "/info", "/info@NatsukiBot" -> replayText(update, "Language: Kotlin \n" +
                        "Library: yat-kotlin-telegram-bot-api \n" +
                        "Running Time: ${PeriodFormat.getDefault().print(Period(startTime, DateTime().toInstant()))}")

                "/ping" -> sendText(update, "pong")
                else -> return false
            }
            return true
        }

        override fun visitUpdate(update: Update) {
            when {
                properties.handleUnknown -> sendText(update, "Unknown command. Try 'ping'.")
            }
        }

        private fun sendText(update: Update, text: String) {
            bot.sendMessage(update.senderId, text).execute()
        }

        private fun replayText(update: Update, text: String) {
            bot.sendMessage(update.senderId, text, replyToMessageId = update.message?.messageId).execute()
        }
    }))
}
