/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.records;


import com.sukitsuki.bot.jooq.game.tables.CharacterLoot;

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
public class CharacterLootRecord extends UpdatableRecordImpl<CharacterLootRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -478702478;

    /**
     * Setter for <code>game.character_loot.character_loot_id</code>.
     */
    public void setCharacterLootId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>game.character_loot.character_loot_id</code>.
     */
    public Integer getCharacterLootId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>game.character_loot.loot_id</code>.
     */
    public void setLootId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>game.character_loot.loot_id</code>.
     */
    public Integer getLootId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>game.character_loot.character_id</code>.
     */
    public void setCharacterId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>game.character_loot.character_id</code>.
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
        return CharacterLoot.CHARACTER_LOOT.CHARACTER_LOOT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CharacterLoot.CHARACTER_LOOT.LOOT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CharacterLoot.CHARACTER_LOOT.CHARACTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCharacterLootId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLootId();
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
    public CharacterLootRecord value1(Integer value) {
        setCharacterLootId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterLootRecord value2(Integer value) {
        setLootId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterLootRecord value3(Integer value) {
        setCharacterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterLootRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CharacterLootRecord
     */
    public CharacterLootRecord() {
        super(CharacterLoot.CHARACTER_LOOT);
    }

    /**
     * Create a detached, initialised CharacterLootRecord
     */
    public CharacterLootRecord(Integer characterLootId, Integer lootId, Integer characterId) {
        super(CharacterLoot.CHARACTER_LOOT);

        set(0, characterLootId);
        set(1, lootId);
        set(2, characterId);
    }
}
