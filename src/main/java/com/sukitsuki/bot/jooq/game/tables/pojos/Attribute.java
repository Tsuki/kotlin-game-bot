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
public class Attribute implements Serializable {

    private static final long serialVersionUID = -768051622;

    private Integer attributeId;
    private String  name;
    private String  desc;

    public Attribute() {}

    public Attribute(Attribute value) {
        this.attributeId = value.attributeId;
        this.name = value.name;
        this.desc = value.desc;
    }

    public Attribute(
        Integer attributeId,
        String  name,
        String  desc
    ) {
        this.attributeId = attributeId;
        this.name = name;
        this.desc = desc;
    }

    public Integer getAttributeId() {
        return this.attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
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
        StringBuilder sb = new StringBuilder("Attribute (");

        sb.append(attributeId);
        sb.append(", ").append(name);
        sb.append(", ").append(desc);

        sb.append(")");
        return sb.toString();
    }
}
