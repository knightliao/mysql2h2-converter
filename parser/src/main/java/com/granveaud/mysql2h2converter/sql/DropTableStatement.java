package com.granveaud.mysql2h2converter.sql;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;

/*
DROP [TEMPORARY] TABLE [IF EXISTS]
tbl_name [, tbl_name] ...
 */

public class DropTableStatement implements Statement {
    private boolean temporary, ifExists;
    private List<String> tableNames;

    // db name
    private String databaseName;

    public DropTableStatement(boolean temporary, boolean ifExists, List<String> tableNames) {
        this.temporary = temporary;
        this.ifExists = ifExists;
        this.tableNames = tableNames;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String toString() {

        List<String> tableNewNames = new ArrayList<String>();
        for (String tableName : tableNames) {
            tableNewNames.add(
                    ((this.databaseName != null) ? (this.databaseName + ".") : "") +
                            tableName);
        }

        return "DROP " + (temporary ? "TEMPORARY " : "") + "TABLE " + (ifExists ? "IF EXISTS " : "") +
                Joiner.on(',').join(tableNewNames);
    }
}
