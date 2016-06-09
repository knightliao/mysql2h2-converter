/* Generated By:JavaCC: Do not edit this line. SQLParserConstants.java */
package com.granveaud.mysql2h2converter.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface SQLParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int S_LINE_COMMENT = 5;
  /** RegularExpression Id. */
  int S_MULTI_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int TODO = 7;
  /** RegularExpression Id. */
  int USE = 8;
  /** RegularExpression Id. */
  int CREATE = 9;
  /** RegularExpression Id. */
  int DROP = 10;
  /** RegularExpression Id. */
  int DATABASE = 11;
  /** RegularExpression Id. */
  int IF = 12;
  /** RegularExpression Id. */
  int NOT = 13;
  /** RegularExpression Id. */
  int EXISTS = 14;
  /** RegularExpression Id. */
  int TEMPORARY = 15;
  /** RegularExpression Id. */
  int TABLE = 16;
  /** RegularExpression Id. */
  int NULL = 17;
  /** RegularExpression Id. */
  int K_DEFAULT = 18;
  /** RegularExpression Id. */
  int AUTO_INCREMENT = 19;
  /** RegularExpression Id. */
  int PRIMARY = 20;
  /** RegularExpression Id. */
  int KEY = 21;
  /** RegularExpression Id. */
  int COMMENT = 22;
  /** RegularExpression Id. */
  int ASC = 23;
  /** RegularExpression Id. */
  int DESC = 24;
  /** RegularExpression Id. */
  int BIT = 25;
  /** RegularExpression Id. */
  int TINYINT = 26;
  /** RegularExpression Id. */
  int UNSIGNED = 27;
  /** RegularExpression Id. */
  int ZEROFILL = 28;
  /** RegularExpression Id. */
  int SMALLINT = 29;
  /** RegularExpression Id. */
  int MEDIUMINT = 30;
  /** RegularExpression Id. */
  int INT = 31;
  /** RegularExpression Id. */
  int INTEGER = 32;
  /** RegularExpression Id. */
  int BIGINT = 33;
  /** RegularExpression Id. */
  int REAL = 34;
  /** RegularExpression Id. */
  int DOUBLE = 35;
  /** RegularExpression Id. */
  int DECIMAL = 36;
  /** RegularExpression Id. */
  int FLOAT = 37;
  /** RegularExpression Id. */
  int NUMERIC = 38;
  /** RegularExpression Id. */
  int DATE = 39;
  /** RegularExpression Id. */
  int DATETIME = 40;
  /** RegularExpression Id. */
  int TIME = 41;
  /** RegularExpression Id. */
  int TIMESTAMP = 42;
  /** RegularExpression Id. */
  int CHAR = 43;
  /** RegularExpression Id. */
  int BINARY = 44;
  /** RegularExpression Id. */
  int ASCII = 45;
  /** RegularExpression Id. */
  int UNICODE = 46;
  /** RegularExpression Id. */
  int VARCHAR = 47;
  /** RegularExpression Id. */
  int TINYBLOB = 48;
  /** RegularExpression Id. */
  int BLOB = 49;
  /** RegularExpression Id. */
  int MEDIUMBLOB = 50;
  /** RegularExpression Id. */
  int LONGBLOB = 51;
  /** RegularExpression Id. */
  int TINYTEXT = 52;
  /** RegularExpression Id. */
  int TEXT = 53;
  /** RegularExpression Id. */
  int MEDIUMTEXT = 54;
  /** RegularExpression Id. */
  int LONGTEXT = 55;
  /** RegularExpression Id. */
  int ENUM = 56;
  /** RegularExpression Id. */
  int SET = 57;
  /** RegularExpression Id. */
  int CONSTRAINT = 58;
  /** RegularExpression Id. */
  int USING = 59;
  /** RegularExpression Id. */
  int INDEX = 60;
  /** RegularExpression Id. */
  int UNIQUE = 61;
  /** RegularExpression Id. */
  int FULLTEXT = 62;
  /** RegularExpression Id. */
  int SPATIAL = 63;
  /** RegularExpression Id. */
  int FOREIGN = 64;
  /** RegularExpression Id. */
  int CHECK = 65;
  /** RegularExpression Id. */
  int REFERENCES = 66;
  /** RegularExpression Id. */
  int MATCH = 67;
  /** RegularExpression Id. */
  int FULL = 68;
  /** RegularExpression Id. */
  int PARTIAL = 69;
  /** RegularExpression Id. */
  int ON = 70;
  /** RegularExpression Id. */
  int DELETE = 71;
  /** RegularExpression Id. */
  int RESTRICT = 72;
  /** RegularExpression Id. */
  int CASCADE = 73;
  /** RegularExpression Id. */
  int NO = 74;
  /** RegularExpression Id. */
  int ACTION = 75;
  /** RegularExpression Id. */
  int UPDATE = 76;
  /** RegularExpression Id. */
  int INSERT = 77;
  /** RegularExpression Id. */
  int INTO = 78;
  /** RegularExpression Id. */
  int VALUES = 79;
  /** RegularExpression Id. */
  int LOW_PRIORITY = 80;
  /** RegularExpression Id. */
  int HIGH_PRIORITY = 81;
  /** RegularExpression Id. */
  int DELAYED = 82;
  /** RegularExpression Id. */
  int IGNORE = 83;
  /** RegularExpression Id. */
  int VALUE = 84;
  /** RegularExpression Id. */
  int SELECT = 85;
  /** RegularExpression Id. */
  int DUPLICATE = 86;
  /** RegularExpression Id. */
  int CURRENT_TIMESTAMP = 87;
  /** RegularExpression Id. */
  int CHARACTER = 88;
  /** RegularExpression Id. */
  int COLLATE = 89;
  /** RegularExpression Id. */
  int ALTER = 90;
  /** RegularExpression Id. */
  int ADD = 91;
  /** RegularExpression Id. */
  int LOCK = 92;
  /** RegularExpression Id. */
  int TABLES = 93;
  /** RegularExpression Id. */
  int AS = 94;
  /** RegularExpression Id. */
  int READ = 95;
  /** RegularExpression Id. */
  int LOCAL = 96;
  /** RegularExpression Id. */
  int WRITE = 97;
  /** RegularExpression Id. */
  int UNLOCK = 98;
  /** RegularExpression Id. */
  int START = 99;
  /** RegularExpression Id. */
  int TRANSACTION = 100;
  /** RegularExpression Id. */
  int COMMIT = 101;
  /** RegularExpression Id. */
  int S_IDENTIFIER = 102;
  /** RegularExpression Id. */
  int S_QUOTED_IDENTIFIER = 103;
  /** RegularExpression Id. */
  int S_LETTER = 104;
  /** RegularExpression Id. */
  int S_DIGIT = 105;
  /** RegularExpression Id. */
  int S_SPECIAL_CHARS = 106;
  /** RegularExpression Id. */
  int S_INTEGER = 107;
  /** RegularExpression Id. */
  int S_DOUBLE = 108;
  /** RegularExpression Id. */
  int S_BINARY_FORMAT1 = 109;
  /** RegularExpression Id. */
  int S_BINARY_FORMAT2 = 110;
  /** RegularExpression Id. */
  int S_HEX_DIGIT = 111;
  /** RegularExpression Id. */
  int S_BIT_FORMAT1 = 112;
  /** RegularExpression Id. */
  int S_BIT_FORMAT2 = 113;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "<S_LINE_COMMENT>",
    "<S_MULTI_LINE_COMMENT>",
    "\"TODO\"",
    "\"USE\"",
    "\"CREATE\"",
    "\"DROP\"",
    "\"DATABASE\"",
    "\"IF\"",
    "\"NOT\"",
    "\"EXISTS\"",
    "\"TEMPORARY\"",
    "\"TABLE\"",
    "\"NULL\"",
    "\"DEFAULT\"",
    "\"AUTO_INCREMENT\"",
    "\"PRIMARY\"",
    "\"KEY\"",
    "\"COMMENT\"",
    "\"ASC\"",
    "\"DESC\"",
    "\"BIT\"",
    "\"TINYINT\"",
    "\"UNSIGNED\"",
    "\"ZEROFILL\"",
    "\"SMALLINT\"",
    "\"MEDIUMINT\"",
    "\"INT\"",
    "\"INTEGER\"",
    "\"BIGINT\"",
    "\"REAL\"",
    "\"DOUBLE\"",
    "\"DECIMAL\"",
    "\"FLOAT\"",
    "\"NUMERIC\"",
    "\"DATE\"",
    "\"DATETIME\"",
    "\"TIME\"",
    "\"TIMESTAMP\"",
    "\"CHAR\"",
    "\"BINARY\"",
    "\"ASCII\"",
    "\"UNICODE\"",
    "\"VARCHAR\"",
    "\"TINYBLOB\"",
    "\"BLOB\"",
    "\"MEDIUMBLOB\"",
    "\"LONGBLOB\"",
    "\"TINYTEXT\"",
    "\"TEXT\"",
    "\"MEDIUMTEXT\"",
    "\"LONGTEXT\"",
    "\"ENUM\"",
    "\"SET\"",
    "\"CONSTRAINT\"",
    "\"USING\"",
    "\"INDEX\"",
    "\"UNIQUE\"",
    "\"FULLTEXT\"",
    "\"SPATIAL\"",
    "\"FOREIGN\"",
    "\"CHECK\"",
    "\"REFERENCES\"",
    "\"MATCH\"",
    "\"FULL\"",
    "\"PARTIAL\"",
    "\"ON\"",
    "\"DELETE\"",
    "\"RESTRICT\"",
    "\"CASCADE\"",
    "\"NO\"",
    "\"ACTION\"",
    "\"UPDATE\"",
    "\"INSERT\"",
    "\"INTO\"",
    "\"VALUES\"",
    "\"LOW_PRIORITY\"",
    "\"HIGH_PRIORITY\"",
    "\"DELAYED\"",
    "\"IGNORE\"",
    "\"VALUE\"",
    "\"SELECT\"",
    "\"DUPLICATE\"",
    "\"CURRENT_TIMESTAMP\"",
    "\"CHARACTER\"",
    "\"COLLATE\"",
    "\"ALTER\"",
    "\"ADD\"",
    "\"LOCK\"",
    "\"TABLES\"",
    "\"AS\"",
    "\"READ\"",
    "\"LOCAL\"",
    "\"WRITE\"",
    "\"UNLOCK\"",
    "\"START\"",
    "\"TRANSACTION\"",
    "\"COMMIT\"",
    "<S_IDENTIFIER>",
    "<S_QUOTED_IDENTIFIER>",
    "<S_LETTER>",
    "<S_DIGIT>",
    "<S_SPECIAL_CHARS>",
    "<S_INTEGER>",
    "<S_DOUBLE>",
    "<S_BINARY_FORMAT1>",
    "<S_BINARY_FORMAT2>",
    "<S_HEX_DIGIT>",
    "<S_BIT_FORMAT1>",
    "<S_BIT_FORMAT2>",
    "\"\\\'\"",
    "\"\\\"\"",
    "\";\"",
    "\"(\"",
    "\")\"",
    "\"=\"",
    "\",\"",
    "\"?\"",
  };

}
