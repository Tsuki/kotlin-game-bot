/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.EntityAttributeRecord;

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
public class EntityAttribute extends TableImpl<EntityAttributeRecord> {

    private static final long serialVersionUID = 342684472;

    /**
     * The reference instance of <code>game.entity_attribute</code>
     */
    public static final EntityAttribute ENTITY_ATTRIBUTE = new EntityAttribute();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntityAttributeRecord> getRecordType() {
        return EntityAttributeRecord.class;
    }

    /**
     * The column <code>game.entity_attribute.entity_attribute_id</code>.
     */
    public final TableField<EntityAttributeRecord, Integer> ENTITY_ATTRIBUTE_ID = createField("entity_attribute_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.entity_attribute.entity_id</code>.
     */
    public final TableField<EntityAttributeRecord, Integer> ENTITY_ID = createField("entity_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.entity_attribute.attribute_id</code>.
     */
    public final TableField<EntityAttributeRecord, Integer> ATTRIBUTE_ID = createField("attribute_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.entity_attribute.value</code>.
     */
    public final TableField<EntityAttributeRecord, Long> VALUE = createField("value", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>game.entity_attribute</code> table reference
     */
    public EntityAttribute() {
        this("entity_attribute", null);
    }

    /**
     * Create an aliased <code>game.entity_attribute</code> table reference
     */
    public EntityAttribute(String alias) {
        this(alias, ENTITY_ATTRIBUTE);
    }

    private EntityAttribute(String alias, Table<EntityAttributeRecord> aliased) {
        this(alias, aliased, null);
    }

    private EntityAttribute(String alias, Table<EntityAttributeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EntityAttributeRecord> getPrimaryKey() {
        return Keys.ENTITY_ATTRIBUTE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EntityAttributeRecord>> getKeys() {
        return Arrays.<UniqueKey<EntityAttributeRecord>>asList(Keys.ENTITY_ATTRIBUTE_PKEY, Keys.ENTITY_ATTRIBUTE_ENTITY_ID_ATTRIBUTE_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EntityAttributeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EntityAttributeRecord, ?>>asList(Keys.ENTITY_ATTRIBUTE__FK_ENTITY_ATTRIBUTE_ENTITY_ID, Keys.ENTITY_ATTRIBUTE__FK_ENTITY_ATTRIBUTE_ATTRIBUTE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityAttribute as(String alias) {
        return new EntityAttribute(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EntityAttribute rename(String name) {
        return new EntityAttribute(name, null);
    }
}
