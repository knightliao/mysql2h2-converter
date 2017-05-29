package com.granveaud.mysql2h2converter.sql;

import static com.granveaud.mysql2h2converter.util.CollectionUtils.joinList;

import java.util.ArrayList;
import java.util.List;

/*
DROP [TEMPORARY] TABLE [IF EXISTS]
tbl_name [, tbl_name] ...
 */

public class DropTableStatement implements SqlStatement {
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
                joinList(tableNewNames, ",");
    }
}
