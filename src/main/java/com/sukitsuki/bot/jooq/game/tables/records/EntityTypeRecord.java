/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.records;


import com.sukitsuki.bot.jooq.game.tables.EntityType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EntityTypeRecord extends UpdatableRecordImpl<EntityTypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -437393663;

    /**
     * Setter for <code>game.entity_type.entity_type_id</code>.
     */
    public void setEntityTypeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>game.entity_type.entity_type_id</code>.
     */
    public Integer getEntityTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.entity_type.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>game.entity_type.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EntityType.ENTITY_TYPE.ENTITY_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EntityType.ENTITY_TYPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEntityTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTypeRecord value1(Integer value) {
        setEntityTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTypeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityTypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EntityTypeRecord
     */
    public EntityTypeRecord() {
        super(EntityType.ENTITY_TYPE);
    }

    /**
     * Create a detached, initialised EntityTypeRecord
     */
    public EntityTypeRecord(Integer entityTypeId, String name) {
        super(EntityType.ENTITY_TYPE);

        set(0, entityTypeId);
        set(1, name);
    }
}
