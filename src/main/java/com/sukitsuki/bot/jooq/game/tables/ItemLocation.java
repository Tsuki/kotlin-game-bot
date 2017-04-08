/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.ItemLocationRecord;

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
public class ItemLocation extends TableImpl<ItemLocationRecord> {

    private static final long serialVersionUID = -1586391491;

    /**
     * The reference instance of <code>game.item_location</code>
     */
    public static final ItemLocation ITEM_LOCATION = new ItemLocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemLocationRecord> getRecordType() {
        return ItemLocationRecord.class;
    }

    /**
     * The column <code>game.item_location.item_location_id</code>.
     */
    public final TableField<ItemLocationRecord, Integer> ITEM_LOCATION_ID = createField("item_location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.item_location.item_id</code>.
     */
    public final TableField<ItemLocationRecord, Integer> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.item_location.location_id</code>.
     */
    public final TableField<ItemLocationRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>game.item_location</code> table reference
     */
    public ItemLocation() {
        this("item_location", null);
    }

    /**
     * Create an aliased <code>game.item_location</code> table reference
     */
    public ItemLocation(String alias) {
        this(alias, ITEM_LOCATION);
    }

    private ItemLocation(String alias, Table<ItemLocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ItemLocation(String alias, Table<ItemLocationRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ItemLocationRecord> getPrimaryKey() {
        return Keys.ITEM_LOCATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ItemLocationRecord>> getKeys() {
        return Arrays.<UniqueKey<ItemLocationRecord>>asList(Keys.ITEM_LOCATION_PKEY, Keys.ITEM_LOCATION_ITEM_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ItemLocationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ItemLocationRecord, ?>>asList(Keys.ITEM_LOCATION__FK_ITEM_LOCATION_ITEM_ID, Keys.ITEM_LOCATION__FK_ITEM_LOCATION_LOCATION_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemLocation as(String alias) {
        return new ItemLocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ItemLocation rename(String name) {
        return new ItemLocation(name, null);
    }
}
