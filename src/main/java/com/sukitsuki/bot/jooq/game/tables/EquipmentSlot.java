/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.EquipmentSlotRecord;

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
public class EquipmentSlot extends TableImpl<EquipmentSlotRecord> {

    private static final long serialVersionUID = -1371764282;

    /**
     * The reference instance of <code>game.equipment_slot</code>
     */
    public static final EquipmentSlot EQUIPMENT_SLOT = new EquipmentSlot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EquipmentSlotRecord> getRecordType() {
        return EquipmentSlotRecord.class;
    }

    /**
     * The column <code>game.equipment_slot.equipment_slot_id</code>.
     */
    public final TableField<EquipmentSlotRecord, Integer> EQUIPMENT_SLOT_ID = createField("equipment_slot_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.equipment_slot.name</code>.
     */
    public final TableField<EquipmentSlotRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(510).nullable(false), this, "");

    /**
     * Create a <code>game.equipment_slot</code> table reference
     */
    public EquipmentSlot() {
        this("equipment_slot", null);
    }

    /**
     * Create an aliased <code>game.equipment_slot</code> table reference
     */
    public EquipmentSlot(String alias) {
        this(alias, EQUIPMENT_SLOT);
    }

    private EquipmentSlot(String alias, Table<EquipmentSlotRecord> aliased) {
        this(alias, aliased, null);
    }

    private EquipmentSlot(String alias, Table<EquipmentSlotRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EquipmentSlotRecord> getPrimaryKey() {
        return Keys.EQUIPMENT_SLOT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EquipmentSlotRecord>> getKeys() {
        return Arrays.<UniqueKey<EquipmentSlotRecord>>asList(Keys.EQUIPMENT_SLOT_PKEY, Keys.EQUIPMENT_SLOT_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EquipmentSlot as(String alias) {
        return new EquipmentSlot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EquipmentSlot rename(String name) {
        return new EquipmentSlot(name, null);
    }
}
