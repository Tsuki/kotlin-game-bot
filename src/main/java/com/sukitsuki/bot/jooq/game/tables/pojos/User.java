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
public class User implements Serializable {

    private static final long serialVersionUID = 1131015282;

    private Integer id;
    private Integer exp;
    private Integer level;
    private Integer attack;
    private Integer defence;
    private Integer faction;
    private Integer location;
    private Integer hp;
    private Integer mp;
    private Integer hpMax;
    private Integer mpMax;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.exp = value.exp;
        this.level = value.level;
        this.attack = value.attack;
        this.defence = value.defence;
        this.faction = value.faction;
        this.location = value.location;
        this.hp = value.hp;
        this.mp = value.mp;
        this.hpMax = value.hpMax;
        this.mpMax = value.mpMax;
    }

    public User(
        Integer id,
        Integer exp,
        Integer level,
        Integer attack,
        Integer defence,
        Integer faction,
        Integer location,
        Integer hp,
        Integer mp,
        Integer hpMax,
        Integer mpMax
    ) {
        this.id = id;
        this.exp = exp;
        this.level = level;
        this.attack = attack;
        this.defence = defence;
        this.faction = faction;
        this.location = location;
        this.hp = hp;
        this.mp = mp;
        this.hpMax = hpMax;
        this.mpMax = mpMax;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExp() {
        return this.exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAttack() {
        return this.attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return this.defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getFaction() {
        return this.faction;
    }

    public void setFaction(Integer faction) {
        this.faction = faction;
    }

    public Integer getLocation() {
        return this.location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getHp() {
        return this.hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMp() {
        return this.mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getHpMax() {
        return this.hpMax;
    }

    public void setHpMax(Integer hpMax) {
        this.hpMax = hpMax;
    }

    public Integer getMpMax() {
        return this.mpMax;
    }

    public void setMpMax(Integer mpMax) {
        this.mpMax = mpMax;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(exp);
        sb.append(", ").append(level);
        sb.append(", ").append(attack);
        sb.append(", ").append(defence);
        sb.append(", ").append(faction);
        sb.append(", ").append(location);
        sb.append(", ").append(hp);
        sb.append(", ").append(mp);
        sb.append(", ").append(hpMax);
        sb.append(", ").append(mpMax);

        sb.append(")");
        return sb.toString();
    }
}