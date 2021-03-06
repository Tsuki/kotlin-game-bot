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
public class ItemLoot implements Serializable {

    private static final long serialVersionUID = 300795369;

    private Integer itemLootId;
    private Integer lootId;
    private Integer itemId;
    private Float   dropChance;

    public ItemLoot() {}

    public ItemLoot(ItemLoot value) {
        this.itemLootId = value.itemLootId;
        this.lootId = value.lootId;
        this.itemId = value.itemId;
        this.dropChance = value.dropChance;
    }

    public ItemLoot(
        Integer itemLootId,
        Integer lootId,
        Integer itemId,
        Float   dropChance
    ) {
        this.itemLootId = itemLootId;
        this.lootId = lootId;
        this.itemId = itemId;
        this.dropChance = dropChance;
    }

    public Integer getItemLootId() {
        return this.itemLootId;
    }

    public void setItemLootId(Integer itemLootId) {
        this.itemLootId = itemLootId;
    }

    public Integer getLootId() {
        return this.lootId;
    }

    public void setLootId(Integer lootId) {
        this.lootId = lootId;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Float getDropChance() {
        return this.dropChance;
    }

    public void setDropChance(Float dropChance) {
        this.dropChance = dropChance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ItemLoot (");

        sb.append(itemLootId);
        sb.append(", ").append(lootId);
        sb.append(", ").append(itemId);
        sb.append(", ").append(dropChance);

        sb.append(")");
        return sb.toString();
    }
}
