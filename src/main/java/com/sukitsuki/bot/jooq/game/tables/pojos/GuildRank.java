/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class GuildRank implements Serializable {

    private static final long serialVersionUID = 1517828756;

    private Integer guildRankId;
    private Integer guildId;
    private Integer rankId;

    public GuildRank() {}

    public GuildRank(GuildRank value) {
        this.guildRankId = value.guildRankId;
        this.guildId = value.guildId;
        this.rankId = value.rankId;
    }

    public GuildRank(
        Integer guildRankId,
        Integer guildId,
        Integer rankId
    ) {
        this.guildRankId = guildRankId;
        this.guildId = guildId;
        this.rankId = rankId;
    }

    public Integer getGuildRankId() {
        return this.guildRankId;
    }

    public void setGuildRankId(Integer guildRankId) {
        this.guildRankId = guildRankId;
    }

    public Integer getGuildId() {
        return this.guildId;
    }

    public void setGuildId(Integer guildId) {
        this.guildId = guildId;
    }

    public Integer getRankId() {
        return this.rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GuildRank (");

        sb.append(guildRankId);
        sb.append(", ").append(guildId);
        sb.append(", ").append(rankId);

        sb.append(")");
        return sb.toString();
    }
}
