/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.public_.tables;


import com.sukitsuki.bot.jooq.public_.Keys;
import com.sukitsuki.bot.jooq.public_.Public;
import com.sukitsuki.bot.jooq.public_.tables.records.TagRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class Tag extends TableImpl<TagRecord> {

    private static final long serialVersionUID = -911873612;

    /**
     * The reference instance of <code>PUBLIC.TAG</code>
     */
    public static final Tag TAG = new Tag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TagRecord> getRecordType() {
        return TagRecord.class;
    }

    /**
     * The column <code>PUBLIC.TAG.ID</code>.
     */
    public final TableField<TagRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("(NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_1E92B028_B915_4E52_AA81_DE5367DBCD7F)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>PUBLIC.TAG.RID</code>.
     */
    public final TableField<TagRecord, String> RID = createField("RID", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.TAG.ZHTW</code>.
     */
    public final TableField<TagRecord, String> ZHTW = createField("ZHTW", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>PUBLIC.TAG.ZHCN</code>.
     */
    public final TableField<TagRecord, String> ZHCN = createField("ZHCN", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>PUBLIC.TAG.EN</code>.
     */
    public final TableField<TagRecord, String> EN = createField("EN", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>PUBLIC.TAG.JP</code>.
     */
    public final TableField<TagRecord, String> JP = createField("JP", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * Create a <code>PUBLIC.TAG</code> table reference
     */
    public Tag() {
        this("TAG", null);
    }

    /**
     * Create an aliased <code>PUBLIC.TAG</code> table reference
     */
    public Tag(String alias) {
        this(alias, TAG);
    }

    private Tag(String alias, Table<TagRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tag(String alias, Table<TagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TagRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TagRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_14;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TagRecord>> getKeys() {
        return Arrays.<UniqueKey<TagRecord>>asList(Keys.CONSTRAINT_14);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tag as(String alias) {
        return new Tag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tag rename(String name) {
        return new Tag(name, null);
    }
}
