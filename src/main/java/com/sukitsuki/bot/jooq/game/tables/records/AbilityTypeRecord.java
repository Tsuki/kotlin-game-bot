/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.records;


import com.sukitsuki.bot.jooq.game.tables.AbilityType;

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
public class AbilityTypeRecord extends UpdatableRecordImpl<AbilityTypeRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1254362835;

    /**
     * Setter for <code>game.ability_type.ability_type_id</code>.
     */
    public void setAbilityTypeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>game.ability_type.ability_type_id</code>.
     */
    public Integer getAbilityTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.ability_type.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>game.ability_type.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>game.ability_type.desc</code>.
     */
    public void setDesc(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>game.ability_type.desc</code>.
     */
    public String getDesc() {
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
        return AbilityType.ABILITY_TYPE.ABILITY_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AbilityType.ABILITY_TYPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AbilityType.ABILITY_TYPE.DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAbilityTypeId();
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
        return getDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbilityTypeRecord value1(Integer value) {
        setAbilityTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbilityTypeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbilityTypeRecord value3(String value) {
        setDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbilityTypeRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AbilityTypeRecord
     */
    public AbilityTypeRecord() {
        super(AbilityType.ABILITY_TYPE);
    }

    /**
     * Create a detached, initialised AbilityTypeRecord
     */
    public AbilityTypeRecord(Integer abilityTypeId, String name, String desc) {
        super(AbilityType.ABILITY_TYPE);

        set(0, abilityTypeId);
        set(1, name);
        set(2, desc);
    }
}
