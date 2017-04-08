/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.records;


import com.sukitsuki.bot.jooq.game.tables.CharacterClass;

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
public class CharacterClassRecord extends UpdatableRecordImpl<CharacterClassRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 521769432;

    /**
     * Setter for <code>game.character_class.character_class_id</code>.
     */
    public void setCharacterClassId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>game.character_class.character_class_id</code>.
     */
    public Integer getCharacterClassId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.character_class.character_id</code>.
     */
    public void setCharacterId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>game.character_class.character_id</code>.
     */
    public Integer getCharacterId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>game.character_class.class_id</code>.
     */
    public void setClassId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>game.character_class.class_id</code>.
     */
    public Integer getClassId() {
        return (Integer) get(2);
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
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CharacterClass.CHARACTER_CLASS.CHARACTER_CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CharacterClass.CHARACTER_CLASS.CHARACTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CharacterClass.CHARACTER_CLASS.CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCharacterClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCharacterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterClassRecord value1(Integer value) {
        setCharacterClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterClassRecord value2(Integer value) {
        setCharacterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterClassRecord value3(Integer value) {
        setClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterClassRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CharacterClassRecord
     */
    public CharacterClassRecord() {
        super(CharacterClass.CHARACTER_CLASS);
    }

    /**
     * Create a detached, initialised CharacterClassRecord
     */
    public CharacterClassRecord(Integer characterClassId, Integer characterId, Integer classId) {
        super(CharacterClass.CHARACTER_CLASS);

        set(0, characterClassId);
        set(1, characterId);
        set(2, classId);
    }
}
