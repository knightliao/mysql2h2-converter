package com.granveaud.mysql2h2converter.sql;

public class CreateSchemaStatement implements SqlStatement {
    private String schemaName;
    private boolean ifNotExists;

    public CreateSchemaStatement(String schemaName, boolean ifNotExists) {
        this.schemaName = schemaName;
        this.ifNotExists = ifNotExists;
    }

    @Override
    public String toString() {
        return "CREATE SCHEMA " + (ifNotExists ? "IF NOT EXISTS " : "") + schemaName;
    }
}
