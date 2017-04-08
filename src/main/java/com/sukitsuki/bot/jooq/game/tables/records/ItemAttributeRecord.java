/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.records;


import com.sukitsuki.bot.jooq.game.tables.ItemAttribute;

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
public class ItemAttributeRecord extends UpdatableRecordImpl<ItemAttributeRecord> implements Record4<Integer, Integer, Integer, Long> {

    private static final long serialVersionUID = -391269440;

    /**
     * Setter for <code>game.item_attribute.item_attribute_id</code>.
     */
    public void setItemAttributeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>game.item_attribute.item_attribute_id</code>.
     */
    public Integer getItemAttributeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.item_attribute.item_id</code>.
     */
    public void setItemId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>game.item_attribute.item_id</code>.
     */
    public Integer getItemId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>game.item_attribute.attribute_id</code>.
     */
    public void setAttributeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>game.item_attribute.attribute_id</code>.
     */
    public Integer getAttributeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>game.item_attribute.value</code>.
     */
    public void setValue(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>game.item_attribute.value</code>.
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
        return ItemAttribute.ITEM_ATTRIBUTE.ITEM_ATTRIBUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ItemAttribute.ITEM_ATTRIBUTE.ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ItemAttribute.ITEM_ATTRIBUTE.ATTRIBUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return ItemAttribute.ITEM_ATTRIBUTE.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getItemAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getItemId();
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
    public ItemAttributeRecord value1(Integer value) {
        setItemAttributeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemAttributeRecord value2(Integer value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemAttributeRecord value3(Integer value) {
        setAttributeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemAttributeRecord value4(Long value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ItemAttributeRecord values(Integer value1, Integer value2, Integer value3, Long value4) {
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
     * Create a detached ItemAttributeRecord
     */
    public ItemAttributeRecord() {
        super(ItemAttribute.ITEM_ATTRIBUTE);
    }

    /**
     * Create a detached, initialised ItemAttributeRecord
     */
    public ItemAttributeRecord(Integer itemAttributeId, Integer itemId, Integer attributeId, Long value) {
        super(ItemAttribute.ITEM_ATTRIBUTE);

        set(0, itemAttributeId);
        set(1, itemId);
        set(2, attributeId);
        set(3, value);
    }
}