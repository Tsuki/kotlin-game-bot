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
public class Character implements Serializable {

    private static final long serialVersionUID = 1908871691;

    private Integer characterId;
    private Integer characterTypeId;
    private String  name;
    private Boolean alive;
    private Short   level;
    private Long    xp;
    private Long    money;

    public Character() {}

    public Character(Character value) {
        this.characterId = value.characterId;
        this.characterTypeId = value.characterTypeId;
        this.name = value.name;
        this.alive = value.alive;
        this.level = value.level;
        this.xp = value.xp;
        this.money = value.money;
    }

    public Character(
        Integer characterId,
        Integer characterTypeId,
        String  name,
        Boolean alive,
        Short   level,
        Long    xp,
        Long    money
    ) {
        this.characterId = characterId;
        this.characterTypeId = characterTypeId;
        this.name = name;
        this.alive = alive;
        this.level = level;
        this.xp = xp;
        this.money = money;
    }

    public Integer getCharacterId() {
        return this.characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public Integer getCharacterTypeId() {
        return this.characterTypeId;
    }

    public void setCharacterTypeId(Integer characterTypeId) {
        this.characterTypeId = characterTypeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAlive() {
        return this.alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public Short getLevel() {
        return this.level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public Long getXp() {
        return this.xp;
    }

    public void setXp(Long xp) {
        this.xp = xp;
    }

    public Long getMoney() {
        return this.money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Character (");

        sb.append(characterId);
        sb.append(", ").append(characterTypeId);
        sb.append(", ").append(name);
        sb.append(", ").append(alive);
        sb.append(", ").append(level);
        sb.append(", ").append(xp);
        sb.append(", ").append(money);

        sb.append(")");
        return sb.toString();
    }
}
