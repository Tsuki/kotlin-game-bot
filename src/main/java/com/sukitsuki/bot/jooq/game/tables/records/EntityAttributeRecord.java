/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.records;


import com.sukitsuki.bot.jooq.game.tables.EntityAttribute;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class EntityAttributeRecord extends UpdatableRecordImpl<EntityAttributeRecord> implements Record4<Integer, Integer, Integer, Long> {

    private static final long serialVersionUID = 1722610720;

    /**
     * Setter for <code>game.entity_attribute.entity_attribute_id</code>.
     */
    public void setEntityAttributeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>game.entity_attribute.entity_attribute_id</code>.
     */
    public Integer getEntityAttributeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.entity_attribute.entity_id</code>.
     */
    public void setEntityId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>game.entity_attribute.entity_id</code>.
     */
    public Integer getEntityId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>game.entity_attribute.attribute_id</code>.
     */
    public void setAttributeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>game.entity_attribute.attribute_id</code>.
     */
    public Integer getAttributeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>game.entity_attribute.value</code>.
     */
    public void setValue(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>game.entity_attribute.value</code>.
     */
    public Long getValue() {
        return (Long) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EntityAttribute.ENTITY_ATTRIBUTE.ENTITY_ATTRIBUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EntityAttribute.ENTITY_ATTRIBUTE.ENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return EntityAttribute.ENTITY_ATTRIBUTE.ATTRIBUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return EntityAttribute.ENTITY_ATTRIBUTE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getEntityAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getEntityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityAttributeRecord value1(Integer value) {
        setEntityAttributeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityAttributeRecord value2(Integer value) {
        setEntityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityAttributeRecord value3(Integer value) {
        setAttributeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityAttributeRecord value4(Long value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityAttributeRecord values(Integer value1, Integer value2, Integer value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EntityAttributeRecord
     */
    public EntityAttributeRecord() {
        super(EntityAttribute.ENTITY_ATTRIBUTE);
    }

    /**
     * Create a detached, initialised EntityAttributeRecord
     */
    public EntityAttributeRecord(Integer entityAttributeId, Integer entityId, Integer attributeId, Long value) {
        super(EntityAttribute.ENTITY_ATTRIBUTE);

        set(0, entityAttributeId);
        set(1, entityId);
        set(2, attributeId);
        set(3, value);
    }
}
