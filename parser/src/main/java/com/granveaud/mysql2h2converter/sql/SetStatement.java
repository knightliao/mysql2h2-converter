package com.granveaud.mysql2h2converter.sql;

import static com.granveaud.mysql2h2converter.util.CollectionUtils.joinList;

import java.util.List;

/*
 SET statement used by H2.

 Examples:
 SET [DATABASE] COLLATION [OFF | collationName [STRENGTH [PRIMARY | SECONDARY | TERTIARY | IDENTICAL]]]
 SET CACHE_SIZE int
 SET SCHEMA_SEARCH_PATH schemaName [,schemaName]*
 */
public class SetStatement implements Statement {
    private String type;
    private List<Value> values;

    public SetStatement(String type, List<Value> values) {
        this.type = type;
        this.values = values;
    }

    @Override

    public String toString() {
        return "SET " + type + " " + joinList(values, " ");
    }
}
