package com.granveaud.mysql2h2converter.sql;

public class UnlockTablesStatement implements Statement {
	@Override
	public String toString() {
		return "UNLOCK TABLES";
	}
}
