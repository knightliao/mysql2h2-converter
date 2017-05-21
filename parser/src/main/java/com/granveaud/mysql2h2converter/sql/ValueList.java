package com.granveaud.mysql2h2converter.sql;

import static com.granveaud.mysql2h2converter.util.CollectionUtils.joinList;

import java.util.List;

public class ValueList {
	private List<Value> values;

	public ValueList(List<Value> values) {
		this.values = values;
	}

    public List<Value> getValues() {
        return values;
    }

    @Override
	public String toString() {
		return "(" + joinList(values, ",") + ")";
	}
}
