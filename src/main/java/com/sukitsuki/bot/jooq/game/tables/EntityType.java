/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.EntityTypeRecord;

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
public class EntityType extends TableImpl<EntityTypeRecord> {

    private static final long serialVersionUID = 751469566;

    /**
     * The reference instance of <code>game.entity_type</code>
     */
    public static final EntityType ENTITY_TYPE = new EntityType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntityTypeRecord> getRecordType() {
        return EntityTypeRecord.class;
    }

    /**
     * The column <code>game.entity_type.entity_type_id</code>.
     */
    public final TableField<EntityTypeRecord, Integer> ENTITY_TYPE_ID = createField("entity_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.entity_type.name</code>.
     */
    public final TableField<EntityTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(510).nullable(false), this, "");

    /**
     * Create a <code>game.entity_type</code> table reference
     */
    public EntityType() {
        this("entity_type", null);
    }

    /**
     * Create an aliased <code>game.entity_type</code> table reference
     */
    public EntityType(String alias) {
        this(alias, ENTITY_TYPE);
    }

    private EntityType(String alias, Table<EntityTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private EntityType(String alias, Table<EntityTypeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EntityTypeRecord> getPrimaryKey() {
        return Keys.ENTITY_TYPE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EntityTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<EntityTypeRecord>>asList(Keys.ENTITY_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityType as(String alias) {
        return new EntityType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityType rename(String name) {
        return new EntityType(name, null);
    }
}