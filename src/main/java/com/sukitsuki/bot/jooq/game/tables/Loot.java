/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.LootRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class Loot extends TableImpl<LootRecord> {

    private static final long serialVersionUID = 1864929089;

    /**
     * The reference instance of <code>game.loot</code>
     */
    public static final Loot LOOT = new Loot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LootRecord> getRecordType() {
        return LootRecord.class;
    }

    /**
     * The column <code>game.loot.loot_id</code>.
     */
    public final TableField<LootRecord, Integer> LOOT_ID = createField("loot_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.loot.xp</code>.
     */
    public final TableField<LootRecord, Long> XP = createField("xp", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>game.loot.money</code>.
     */
    public final TableField<LootRecord, Long> MONEY = createField("money", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>game.loot</code> table reference
     */
    public Loot() {
        this("loot", null);
    }

    /**
     * Create an aliased <code>game.loot</code> table reference
     */
    public Loot(String alias) {
        this(alias, LOOT);
    }

    private Loot(String alias, Table<LootRecord> aliased) {
        this(alias, aliased, null);
    }

    private Loot(String alias, Table<LootRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<LootRecord> getPrimaryKey() {
        return Keys.LOOT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LootRecord>> getKeys() {
        return Arrays.<UniqueKey<LootRecord>>asList(Keys.LOOT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Loot as(String alias) {
        return new Loot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Loot rename(String name) {
        return new Loot(name, null);
    }
}
