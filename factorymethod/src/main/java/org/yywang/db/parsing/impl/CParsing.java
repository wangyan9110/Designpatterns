package org.yywang.db.parsing.impl;


import org.yywang.db.parsing.Parsing;

public class CParsing implements Parsing {

    @Override
    public void checkGrammar() {
        System.out.println("check c grammar");
    }

    @Override
    public void parseCode() {
        System.out.println("parse c code");
    }
}
