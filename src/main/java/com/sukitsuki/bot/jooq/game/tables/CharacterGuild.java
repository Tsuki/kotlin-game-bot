/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.CharacterGuildRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterGuild extends TableImpl<CharacterGuildRecord> {

    private static final long serialVersionUID = 628967401;

    /**
     * The reference instance of <code>game.character_guild</code>
     */
    public static final CharacterGuild CHARACTER_GUILD = new CharacterGuild();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CharacterGuildRecord> getRecordType() {
        return CharacterGuildRecord.class;
    }

    /**
     * The column <code>game.character_guild.character_guild_id</code>.
     */
    public final TableField<CharacterGuildRecord, Integer> CHARACTER_GUILD_ID = createField("character_guild_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.character_guild.character_id</code>.
     */
    public final TableField<CharacterGuildRecord, Integer> CHARACTER_ID = createField("character_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.character_guild.guild_id</code>.
     */
    public final TableField<CharacterGuildRecord, Integer> GUILD_ID = createField("guild_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.character_guild.guild_leader</code>.
     */
    public final TableField<CharacterGuildRecord, Boolean> GUILD_LEADER = createField("guild_leader", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>game.character_guild</code> table reference
     */
    public CharacterGuild() {
        this("character_guild", null);
    }

    /**
     * Create an aliased <code>game.character_guild</code> table reference
     */
    public CharacterGuild(String alias) {
        this(alias, CHARACTER_GUILD);
    }

    private CharacterGuild(String alias, Table<CharacterGuildRecord> aliased) {
        this(alias, aliased, null);
    }

    private CharacterGuild(String alias, Table<CharacterGuildRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Game.GAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CharacterGuildRecord> getPrimaryKey() {
        return Keys.CHARACTER_GUILD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CharacterGuildRecord>> getKeys() {
        return Arrays.<UniqueKey<CharacterGuildRecord>>asList(Keys.CHARACTER_GUILD_PKEY, Keys.CHARACTER_GUILD_GUILD_ID_GUILD_LEADER_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CharacterGuildRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CharacterGuildRecord, ?>>asList(Keys.CHARACTER_GUILD__FK_CHARACTER_GUILD_CHARACTER_ID, Keys.CHARACTER_GUILD__FK_CHARACTER_GUILD_GUILD_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterGuild as(String alias) {
        return new CharacterGuild(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterGuild rename(String name) {
        return new CharacterGuild(name, null);
    }
}
