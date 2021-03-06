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
public class Item implements Serializable {

    private static final long serialVersionUID = 907444326;

    private Integer itemId;
    private Integer itemTypeId;
    private String  name;
    private Short   requiredLevel;
    private Boolean durability;

    public Item() {}

    public Item(Item value) {
        this.itemId = value.itemId;
        this.itemTypeId = value.itemTypeId;
        this.name = value.name;
        this.requiredLevel = value.requiredLevel;
        this.durability = value.durability;
    }

    public Item(
        Integer itemId,
        Integer itemTypeId,
        String  name,
        Short   requiredLevel,
        Boolean durability
    ) {
        this.itemId = itemId;
        this.itemTypeId = itemTypeId;
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.durability = durability;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemTypeId() {
        return this.itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getRequiredLevel() {
        return this.requiredLevel;
    }

    public void setRequiredLevel(Short requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public Boolean getDurability() {
        return this.durability;
    }

    public void setDurability(Boolean durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Item (");

        sb.append(itemId);
        sb.append(", ").append(itemTypeId);
        sb.append(", ").append(name);
        sb.append(", ").append(requiredLevel);
        sb.append(", ").append(durability);

        sb.append(")");
        return sb.toString();
    }
}
