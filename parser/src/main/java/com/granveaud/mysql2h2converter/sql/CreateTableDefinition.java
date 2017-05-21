package com.granveaud.mysql2h2converter.sql;

import static com.granveaud.mysql2h2converter.util.CollectionUtils.concat;
import static com.granveaud.mysql2h2converter.util.CollectionUtils.joinList;

import java.util.List;

public class CreateTableDefinition {
    private List<ColumnDefinition> columnDefinitions;
    private List<ColumnConstraint> constraints;

    public CreateTableDefinition(List<ColumnDefinition> columnDefinitions, List<ColumnConstraint> constraints) {
        this.columnDefinitions = columnDefinitions;
        this.constraints = constraints;
    }

    public List<ColumnDefinition> getColumnDefinitions() {
        return columnDefinitions;
    }

    public List<ColumnConstraint> getConstraints() {
        return constraints;
    }

    @Override
    public String toString() {
        return joinList(concat(columnDefinitions, constraints), ",");
    }
}
