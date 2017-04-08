/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.records;


import com.sukitsuki.bot.jooq.game.tables.Conf;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class ConfRecord extends UpdatableRecordImpl<ConfRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -1451565417;

    /**
     * Setter for <code>game.conf.conf_id</code>.
     */
    public void setConfId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>game.conf.conf_id</code>.
     */
    public Integer getConfId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.conf.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>game.conf.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>game.conf.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>game.conf.value</code>.
     */
    public String getValue() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Conf.CONF.CONF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Conf.CONF.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Conf.CONF.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getConfId();
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
    public String value3() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfRecord value1(Integer value) {
        setConfId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfRecord value3(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConfRecord
     */
    public ConfRecord() {
        super(Conf.CONF);
    }

    /**
     * Create a detached, initialised ConfRecord
     */
    public ConfRecord(Integer confId, String name, String value) {
        super(Conf.CONF);

        set(0, confId);
        set(1, name);
        set(2, value);
    }
}
