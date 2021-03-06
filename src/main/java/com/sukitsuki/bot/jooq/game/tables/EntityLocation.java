/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.EntityLocationRecord;

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
public class EntityLocation extends TableImpl<EntityLocationRecord> {

    private static final long serialVersionUID = 1739120461;

    /**
     * The reference instance of <code>game.entity_location</code>
     */
    public static final EntityLocation ENTITY_LOCATION = new EntityLocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntityLocationRecord> getRecordType() {
        return EntityLocationRecord.class;
    }

    /**
     * The column <code>game.entity_location.entity_location_id</code>.
     */
    public final TableField<EntityLocationRecord, Integer> ENTITY_LOCATION_ID = createField("entity_location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.entity_location.entity_id</code>.
     */
    public final TableField<EntityLocationRecord, Integer> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.entity_location.location_id</code>.
     */
    public final TableField<EntityLocationRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>game.entity_location</code> table reference
     */
    public EntityLocation() {
        this("entity_location", null);
    }

    /**
     * Create an aliased <code>game.entity_location</code> table reference
     */
    public EntityLocation(String alias) {
        this(alias, ENTITY_LOCATION);
    }

    private EntityLocation(String alias, Table<EntityLocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private EntityLocation(String alias, Table<EntityLocationRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EntityLocationRecord> getPrimaryKey() {
        return Keys.ENTITY_LOCATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EntityLocationRecord>> getKeys() {
        return Arrays.<UniqueKey<EntityLocationRecord>>asList(Keys.ENTITY_LOCATION_PKEY, Keys.ENTITY_LOCATION_ENTITY_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EntityLocationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EntityLocationRecord, ?>>asList(Keys.ENTITY_LOCATION__FK_ENTITY_LOCATION_ENTITY_ID, Keys.ENTITY_LOCATION__FK_ENTITY_LOCATION_LOCATION_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityLocation as(String alias) {
        return new EntityLocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityLocation rename(String name) {
        return new EntityLocation(name, null);
    }
}
