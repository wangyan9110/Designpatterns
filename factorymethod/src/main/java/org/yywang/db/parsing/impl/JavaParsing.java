package org.yywang.db.parsing.impl;


import org.yywang.db.parsing.Parsing;

public class JavaParsing implements Parsing {
    @Override
    public void checkGrammar() {
        System.out.println("check java grammar");
    }

    @Override
    public void parseCode() {
        System.out.println("parse java code");
    }
}
