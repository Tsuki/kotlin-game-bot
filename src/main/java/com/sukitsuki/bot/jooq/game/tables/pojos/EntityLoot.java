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
public class EntityLoot implements Serializable {

    private static final long serialVersionUID = 1073420098;

    private Integer entityLootId;
    private Integer lootId;
    private Integer entityId;

    public EntityLoot() {}

    public EntityLoot(EntityLoot value) {
        this.entityLootId = value.entityLootId;
        this.lootId = value.lootId;
        this.entityId = value.entityId;
    }

    public EntityLoot(
        Integer entityLootId,
        Integer lootId,
        Integer entityId
    ) {
        this.entityLootId = entityLootId;
        this.lootId = lootId;
        this.entityId = entityId;
    }

    public Integer getEntityLootId() {
        return this.entityLootId;
    }

    public void setEntityLootId(Integer entityLootId) {
        this.entityLootId = entityLootId;
    }

    public Integer getLootId() {
        return this.lootId;
    }

    public void setLootId(Integer lootId) {
        this.lootId = lootId;
    }

    public Integer getEntityId() {
        return this.entityId;
    }

    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EntityLoot (");

        sb.append(entityLootId);
        sb.append(", ").append(lootId);
        sb.append(", ").append(entityId);

        sb.append(")");
        return sb.toString();
    }
}