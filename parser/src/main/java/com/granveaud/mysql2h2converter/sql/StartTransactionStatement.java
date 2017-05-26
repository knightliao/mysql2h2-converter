package com.granveaud.mysql2h2converter.sql;

public class StartTransactionStatement implements SqlStatement {
    @Override
    public String toString() {
        return "START TRANSACTION";
    }
}
