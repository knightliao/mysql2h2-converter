package com.granveaud.mysql2h2converter.sql;

public class CommitTransactionStatement implements SqlStatement {
    @Override
    public String toString() {
        return "COMMIT";
    }
}
