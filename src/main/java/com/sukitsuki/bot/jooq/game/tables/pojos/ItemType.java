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
public class ItemType implements Serializable {

    private static final long serialVersionUID = -433706093;

    private Integer itemTypeId;
    private String  name;
    private String  desc;

    public ItemType() {}

    public ItemType(ItemType value) {
        this.itemTypeId = value.itemTypeId;
        this.name = value.name;
        this.desc = value.desc;
    }

    public ItemType(
        Integer itemTypeId,
        String  name,
        String  desc
    ) {
        this.itemTypeId = itemTypeId;
        this.name = name;
        this.desc = desc;
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

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ItemType (");

        sb.append(itemTypeId);
        sb.append(", ").append(name);
        sb.append(", ").append(desc);

        sb.append(")");
        return sb.toString();
    }
}