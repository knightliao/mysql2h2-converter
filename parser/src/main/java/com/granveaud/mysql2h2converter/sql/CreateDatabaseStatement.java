package com.granveaud.mysql2h2converter.sql;

public class CreateDatabaseStatement implements SqlStatement {
    private String dbName;
    private boolean ifNotExists;

    public CreateDatabaseStatement(String dbName, boolean ifNotExists) {
        this.dbName = dbName;
        this.ifNotExists = ifNotExists;
    }

    public String getDbName() {
        return dbName;
    }

    public boolean isIfNotExists() {
        return ifNotExists;
    }

    @Override
    public String toString() {
        return "CREATE DATABASE " + (ifNotExists ? "IF NOT EXISTS " : "") + dbName;
    }
}
