/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.CharacterStatusEffectRecord;

import java.sql.Timestamp;
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
public class CharacterStatusEffect extends TableImpl<CharacterStatusEffectRecord> {

    private static final long serialVersionUID = -899955057;

    /**
     * The reference instance of <code>game.character_status_effect</code>
     */
    public static final CharacterStatusEffect CHARACTER_STATUS_EFFECT = new CharacterStatusEffect();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CharacterStatusEffectRecord> getRecordType() {
        return CharacterStatusEffectRecord.class;
    }

    /**
     * The column <code>game.character_status_effect.character_status_effect_id</code>.
     */
    public final TableField<CharacterStatusEffectRecord, Integer> CHARACTER_STATUS_EFFECT_ID = createField("character_status_effect_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.character_status_effect.character_id</code>.
     */
    public final TableField<CharacterStatusEffectRecord, Integer> CHARACTER_ID = createField("character_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.character_status_effect.status_effect_id</code>.
     */
    public final TableField<CharacterStatusEffectRecord, Integer> STATUS_EFFECT_ID = createField("status_effect_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.character_status_effect.date</code>.
     */
    public final TableField<CharacterStatusEffectRecord, Timestamp> DATE = createField("date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>game.character_status_effect</code> table reference
     */
    public CharacterStatusEffect() {
        this("character_status_effect", null);
    }

    /**
     * Create an aliased <code>game.character_status_effect</code> table reference
     */
    public CharacterStatusEffect(String alias) {
        this(alias, CHARACTER_STATUS_EFFECT);
    }

    private CharacterStatusEffect(String alias, Table<CharacterStatusEffectRecord> aliased) {
        this(alias, aliased, null);
    }

    private CharacterStatusEffect(String alias, Table<CharacterStatusEffectRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CharacterStatusEffectRecord> getPrimaryKey() {
        return Keys.CHARACTER_STATUS_EFFECT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CharacterStatusEffectRecord>> getKeys() {
        return Arrays.<UniqueKey<CharacterStatusEffectRecord>>asList(Keys.CHARACTER_STATUS_EFFECT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CharacterStatusEffectRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CharacterStatusEffectRecord, ?>>asList(Keys.CHARACTER_STATUS_EFFECT__FK_CHARACTER_STATUS_EFFECT_CHARACTER_ID, Keys.CHARACTER_STATUS_EFFECT__FK_CHARACTER_STATUS_EFFECT_STATUS_EFFECT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterStatusEffect as(String alias) {
        return new CharacterStatusEffect(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterStatusEffect rename(String name) {
        return new CharacterStatusEffect(name, null);
    }
}
