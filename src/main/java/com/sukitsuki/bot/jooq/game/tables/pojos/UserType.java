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
public class UserType implements Serializable {

    private static final long serialVersionUID = 505742874;

    private Integer userTypeId;
    private String  name;

    public UserType() {}

    public UserType(UserType value) {
        this.userTypeId = value.userTypeId;
        this.name = value.name;
    }

    public UserType(
        Integer userTypeId,
        String  name
    ) {
        this.userTypeId = userTypeId;
        this.name = name;
    }

    public Integer getUserTypeId() {
        return this.userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserType (");

        sb.append(userTypeId);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}