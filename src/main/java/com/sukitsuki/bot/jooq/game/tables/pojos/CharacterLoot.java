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
public class CharacterLoot implements Serializable {

    private static final long serialVersionUID = -1902349082;

    private Integer characterLootId;
    private Integer lootId;
    private Integer characterId;

    public CharacterLoot() {}

    public CharacterLoot(CharacterLoot value) {
        this.characterLootId = value.characterLootId;
        this.lootId = value.lootId;
        this.characterId = value.characterId;
    }

    public CharacterLoot(
        Integer characterLootId,
        Integer lootId,
        Integer characterId
    ) {
        this.characterLootId = characterLootId;
        this.lootId = lootId;
        this.characterId = characterId;
    }

    public Integer getCharacterLootId() {
        return this.characterLootId;
    }

    public void setCharacterLootId(Integer characterLootId) {
        this.characterLootId = characterLootId;
    }

    public Integer getLootId() {
        return this.lootId;
    }

    public void setLootId(Integer lootId) {
        this.lootId = lootId;
    }

    public Integer getCharacterId() {
        return this.characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CharacterLoot (");

        sb.append(characterLootId);
        sb.append(", ").append(lootId);
        sb.append(", ").append(characterId);

        sb.append(")");
        return sb.toString();
    }
}
