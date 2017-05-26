package com.granveaud.mysql2h2converter.sql;

import static com.granveaud.mysql2h2converter.util.CollectionUtils.joinList;

import java.util.List;

/*
LOCK TABLES
    tbl_name [AS alias] {READ [LOCAL] | [LOW_PRIORITY] WRITE}
    [, tbl_name [AS alias] {READ [LOCAL] | [LOW_PRIORITY] WRITE}] ...
 */
public class LockTablesStatement implements SqlStatement {
    private List<LockTablesSpecification> specifications;

    public LockTablesStatement(List<LockTablesSpecification> specifications) {
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return "LOCK TABLES " + joinList(specifications, ",");
    }
}
