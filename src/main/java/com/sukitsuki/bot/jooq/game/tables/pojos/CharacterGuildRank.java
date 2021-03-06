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
public class CharacterGuildRank implements Serializable {

    private static final long serialVersionUID = 1790232610;

    private Integer characterGuildRankId;
    private Integer characterId;
    private Integer guildRankId;

    public CharacterGuildRank() {}

    public CharacterGuildRank(CharacterGuildRank value) {
        this.characterGuildRankId = value.characterGuildRankId;
        this.characterId = value.characterId;
        this.guildRankId = value.guildRankId;
    }

    public CharacterGuildRank(
        Integer characterGuildRankId,
        Integer characterId,
        Integer guildRankId
    ) {
        this.characterGuildRankId = characterGuildRankId;
        this.characterId = characterId;
        this.guildRankId = guildRankId;
    }

    public Integer getCharacterGuildRankId() {
        return this.characterGuildRankId;
    }

    public void setCharacterGuildRankId(Integer characterGuildRankId) {
        this.characterGuildRankId = characterGuildRankId;
    }

    public Integer getCharacterId() {
        return this.characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public Integer getGuildRankId() {
        return this.guildRankId;
    }

    public void setGuildRankId(Integer guildRankId) {
        this.guildRankId = guildRankId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CharacterGuildRank (");

        sb.append(characterGuildRankId);
        sb.append(", ").append(characterId);
        sb.append(", ").append(guildRankId);

        sb.append(")");
        return sb.toString();
    }
}
