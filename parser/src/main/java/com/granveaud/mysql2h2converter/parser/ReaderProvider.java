package com.granveaud.mysql2h2converter.parser;

import java.io.IOException;
import java.io.Reader;

public class ReaderProvider implements Provider {

    private Reader reader;

    public ReaderProvider(Reader reader) {
        this.reader = reader;
    }

    @Override
    public int read(char[] buffer, int offset, int len) throws IOException {
        return reader.read(buffer, offset, len);
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }

}
