/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.records;


import com.sukitsuki.bot.jooq.game.tables.UserCharacter;

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
public class UserCharacterRecord extends UpdatableRecordImpl<UserCharacterRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -564234559;

    /**
     * Setter for <code>game.user_character.user_character_id</code>.
     */
    public void setUserCharacterId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>game.user_character.user_character_id</code>.
     */
    public Integer getUserCharacterId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.user_character.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>game.user_character.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>game.user_character.character_id</code>.
     */
    public void setCharacterId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>game.user_character.character_id</code>.
     */
    public Integer getCharacterId() {
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
        return UserCharacter.USER_CHARACTER.USER_CHARACTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserCharacter.USER_CHARACTER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserCharacter.USER_CHARACTER.CHARACTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUserCharacterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCharacterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCharacterRecord value1(Integer value) {
        setUserCharacterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCharacterRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCharacterRecord value3(Integer value) {
        setCharacterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserCharacterRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserCharacterRecord
     */
    public UserCharacterRecord() {
        super(UserCharacter.USER_CHARACTER);
    }

    /**
     * Create a detached, initialised UserCharacterRecord
     */
    public UserCharacterRecord(Integer userCharacterId, Integer userId, Integer characterId) {
        super(UserCharacter.USER_CHARACTER);

        set(0, userCharacterId);
        set(1, userId);
        set(2, characterId);
    }
}
