/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.PlaceRecord;

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
public class Place extends TableImpl<PlaceRecord> {

    private static final long serialVersionUID = -1739767235;

    /**
     * The reference instance of <code>game.place</code>
     */
    public static final Place PLACE = new Place();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlaceRecord> getRecordType() {
        return PlaceRecord.class;
    }

    /**
     * The column <code>game.place.place_id</code>.
     */
    public final TableField<PlaceRecord, Integer> PLACE_ID = createField("place_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.place.name</code>.
     */
    public final TableField<PlaceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(510).nullable(false), this, "");

    /**
     * Create a <code>game.place</code> table reference
     */
    public Place() {
        this("place", null);
    }

    /**
     * Create an aliased <code>game.place</code> table reference
     */
    public Place(String alias) {
        this(alias, PLACE);
    }

    private Place(String alias, Table<PlaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Place(String alias, Table<PlaceRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<PlaceRecord> getPrimaryKey() {
        return Keys.PLACE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PlaceRecord>> getKeys() {
        return Arrays.<UniqueKey<PlaceRecord>>asList(Keys.PLACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Place as(String alias) {
        return new Place(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Place rename(String name) {
        return new Place(name, null);
    }
}
