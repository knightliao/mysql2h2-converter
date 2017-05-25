mysql2h2-converter
==================

A MySQL to H2 SQL conversion library written in Java.

## demo

    java -jar lib/mysql2h2.jar demos/disconf-mysql.sql



## Building
`mvn install`

## Compiling with JavaCC
`mvn com.helger.maven:ph-javacc-maven-plugin:javacc`
You'll have to change the type of SQLParserTokenManager.curChar to a `char` from an `int`. Haven't figured out how to get rid of that yet.
