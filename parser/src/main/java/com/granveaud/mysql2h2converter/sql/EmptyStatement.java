package com.granveaud.mysql2h2converter.sql;

public class EmptyStatement implements SqlStatement {
    @Override
    public String toString() {
        return "";
    }
}
