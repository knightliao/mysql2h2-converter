package com.granveaud.mysql2h2converter;

import java.util.Iterator;

import java.io.Reader;
import java.io.StringReader;

import com.granveaud.mysql2h2converter.parser.ParseException;
import com.granveaud.mysql2h2converter.parser.ReaderProvider;
import com.granveaud.mysql2h2converter.parser.SQLParser;
import com.granveaud.mysql2h2converter.sql.SqlStatement;

public class SQLParserManager {
    static class ScriptIterator implements Iterator<SqlStatement> {
        private SQLParser parser;
        private SqlStatement nextStatement;

        ScriptIterator(SQLParser parser) {
            this.parser = parser;
            parseNextStatement();
        }

        private void parseNextStatement() {
            try {
                nextStatement = parser.ScriptStatement();
            } catch (ParseException e) {
                throw new IllegalArgumentException("Cannot parse next statement", e);
            }
        }

        @Override
        public boolean hasNext() {
            return (nextStatement != null);
        }

        @Override
        public SqlStatement next() {
            SqlStatement result = nextStatement;
            parseNextStatement();

            return result;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static SqlStatement parseStatement(String str) throws ParseException {
        return parseStatement(new StringReader(str));
    }

    public static SqlStatement parseStatement(Reader reader) throws ParseException {
        SQLParser parser = new SQLParser(new ReaderProvider(reader));
        return parser.Statement();
    }

    /**
     * Reads from the supplied Reader and parses the MySQL script contained therein.
     */
    public static Iterator<SqlStatement> parseScript(Reader reader) throws ParseException {
        SQLParser parser = new SQLParser(new ReaderProvider(reader));
        return new ScriptIterator(parser);
    }
}
