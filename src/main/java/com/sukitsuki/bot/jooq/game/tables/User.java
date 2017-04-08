/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.UserRecord;

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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 217420606;

    /**
     * The reference instance of <code>game.User</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>game.User.id</code>.
     */
    public final TableField<UserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.User.exp</code>.
     */
    public final TableField<UserRecord, Integer> EXP = createField("exp", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.level</code>.
     */
    public final TableField<UserRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.attack</code>.
     */
    public final TableField<UserRecord, Integer> ATTACK = createField("attack", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.defence</code>.
     */
    public final TableField<UserRecord, Integer> DEFENCE = createField("defence", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.faction</code>.
     */
    public final TableField<UserRecord, Integer> FACTION = createField("faction", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.location</code>.
     */
    public final TableField<UserRecord, Integer> LOCATION = createField("location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.hp</code>.
     */
    public final TableField<UserRecord, Integer> HP = createField("hp", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.mp</code>.
     */
    public final TableField<UserRecord, Integer> MP = createField("mp", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.hp_max</code>.
     */
    public final TableField<UserRecord, Integer> HP_MAX = createField("hp_max", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>game.User.mp_max</code>.
     */
    public final TableField<UserRecord, Integer> MP_MAX = createField("mp_max", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>game.User</code> table reference
     */
    public User() {
        this("User", null);
    }

    /**
     * Create an aliased <code>game.User</code> table reference
     */
    public User(String alias) {
        this(alias, USER);
    }

    private User(String alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(String alias, Table<UserRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.USER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.USER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(name, null);
    }
}