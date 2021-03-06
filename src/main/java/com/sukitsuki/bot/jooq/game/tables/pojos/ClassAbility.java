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
public class ClassAbility implements Serializable {

    private static final long serialVersionUID = -50391390;

    private Integer classAbilityId;
    private Integer classId;
    private Integer abilityId;

    public ClassAbility() {}

    public ClassAbility(ClassAbility value) {
        this.classAbilityId = value.classAbilityId;
        this.classId = value.classId;
        this.abilityId = value.abilityId;
    }

    public ClassAbility(
        Integer classAbilityId,
        Integer classId,
        Integer abilityId
    ) {
        this.classAbilityId = classAbilityId;
        this.classId = classId;
        this.abilityId = abilityId;
    }

    public Integer getClassAbilityId() {
        return this.classAbilityId;
    }

    public void setClassAbilityId(Integer classAbilityId) {
        this.classAbilityId = classAbilityId;
    }

    public Integer getClassId() {
        return this.classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getAbilityId() {
        return this.abilityId;
    }

    public void setAbilityId(Integer abilityId) {
        this.abilityId = abilityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassAbility (");

        sb.append(classAbilityId);
        sb.append(", ").append(classId);
        sb.append(", ").append(abilityId);

        sb.append(")");
        return sb.toString();
    }
}
