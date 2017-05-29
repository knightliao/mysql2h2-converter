mysql2h2-converter
==================

A MySQL to H2 SQL conversion library written in Java.

Parse a MySQL dump and convert it to H2 statements either as an embedded library or as a standalone tool.

Next steps can include:
- clean up the interface to avoid Iterators
- implement other statements (SELECT, UPDATE...)
- provide samples for an on-the-fly conversion with datasource-proxy http://code.google.com/p/datasource-proxy/

Other ideas:
- look at jOOQ http://www.jooq.org/ to see if it can be used to model the DML statements and Liquibase http://www.liquibase.org/
  for the DDL part

## Usage

As a library:
``` java
private static void convertAndCreate(Statement stmt, String sqlDump) throws SQLException, ParseException {
    Iterator<SqlStatement> sourceIterator = SQLParserManager.parseScript(new StringReader(sqlDump));
    Iterator<SqlStatement> converted = H2Converter.convertScript(sourceIterator);
    while (converted.hasNext()) {
        stmt.execute(converted.next().toString());
    }
}
```

On the command line:

``` bash
java -jar lib/mysql2h2.jar demos/disconf-mysql.sql
```

## Building
`mvn install` will generate the SQL parser and build an executable JAR.

License
=======
This code is provided under the MIT license.
