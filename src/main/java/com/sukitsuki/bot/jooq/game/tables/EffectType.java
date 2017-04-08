/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.EffectTypeRecord;

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
public class EffectType extends TableImpl<EffectTypeRecord> {

    private static final long serialVersionUID = -593293225;

    /**
     * The reference instance of <code>game.effect_type</code>
     */
    public static final EffectType EFFECT_TYPE = new EffectType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EffectTypeRecord> getRecordType() {
        return EffectTypeRecord.class;
    }

    /**
     * The column <code>game.effect_type.effect_type_id</code>.
     */
    public final TableField<EffectTypeRecord, Integer> EFFECT_TYPE_ID = createField("effect_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.effect_type.name</code>.
     */
    public final TableField<EffectTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(510).nullable(false), this, "");

    /**
     * The column <code>game.effect_type.desc</code>.
     */
    public final TableField<EffectTypeRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.VARCHAR.length(510).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>game.effect_type</code> table reference
     */
    public EffectType() {
        this("effect_type", null);
    }

    /**
     * Create an aliased <code>game.effect_type</code> table reference
     */
    public EffectType(String alias) {
        this(alias, EFFECT_TYPE);
    }

    private EffectType(String alias, Table<EffectTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private EffectType(String alias, Table<EffectTypeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EffectTypeRecord> getPrimaryKey() {
        return Keys.EFFECT_TYPE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EffectTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<EffectTypeRecord>>asList(Keys.EFFECT_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EffectType as(String alias) {
        return new EffectType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EffectType rename(String name) {
        return new EffectType(name, null);
    }
}
