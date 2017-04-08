/*
 * This file is generated by jOOQ.
*/
package com.sukitsuki.bot.jooq.game;


import com.sukitsuki.bot.jooq.DefaultCatalog;
import com.sukitsuki.bot.jooq.game.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Game extends SchemaImpl {

    private static final long serialVersionUID = -1480670843;

    /**
     * The reference instance of <code>game</code>
     */
    public static final Game GAME = new Game();

    /**
     * The table <code>game.User</code>.
     */
    public final User USER = com.sukitsuki.bot.jooq.game.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Game() {
        super("game", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            User.USER);
    }
}