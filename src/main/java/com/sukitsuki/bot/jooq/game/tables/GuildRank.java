/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables;


import com.sukitsuki.bot.jooq.game.Game;
import com.sukitsuki.bot.jooq.game.Keys;
import com.sukitsuki.bot.jooq.game.tables.records.GuildRankRecord;

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
public class GuildRank extends TableImpl<GuildRankRecord> {

    private static final long serialVersionUID = -64206432;

    /**
     * The reference instance of <code>game.guild_rank</code>
     */
    public static final GuildRank GUILD_RANK = new GuildRank();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GuildRankRecord> getRecordType() {
        return GuildRankRecord.class;
    }

    /**
     * The column <code>game.guild_rank.guild_rank_id</code>.
     */
    public final TableField<GuildRankRecord, Integer> GUILD_RANK_ID = createField("guild_rank_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.guild_rank.guild_id</code>.
     */
    public final TableField<GuildRankRecord, Integer> GUILD_ID = createField("guild_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>game.guild_rank.rank_id</code>.
     */
    public final TableField<GuildRankRecord, Integer> RANK_ID = createField("rank_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>game.guild_rank</code> table reference
     */
    public GuildRank() {
        this("guild_rank", null);
    }

    /**
     * Create an aliased <code>game.guild_rank</code> table reference
     */
    public GuildRank(String alias) {
        this(alias, GUILD_RANK);
    }

    private GuildRank(String alias, Table<GuildRankRecord> aliased) {
        this(alias, aliased, null);
    }

    private GuildRank(String alias, Table<GuildRankRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<GuildRankRecord> getPrimaryKey() {
        return Keys.GUILD_RANK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GuildRankRecord>> getKeys() {
        return Arrays.<UniqueKey<GuildRankRecord>>asList(Keys.GUILD_RANK_PKEY, Keys.GUILD_RANK_GUILD_ID_RANK_ID_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GuildRankRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GuildRankRecord, ?>>asList(Keys.GUILD_RANK__FK_GUILD_RANK_GUILD_ID, Keys.GUILD_RANK__FK_GUILD_RANK_RANK_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GuildRank as(String alias) {
        return new GuildRank(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GuildRank rename(String name) {
        return new GuildRank(name, null);
    }
}
