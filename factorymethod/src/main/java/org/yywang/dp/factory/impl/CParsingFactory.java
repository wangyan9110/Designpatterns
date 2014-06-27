package org.yywang.dp.factory.impl;


import org.yywang.db.parsing.impl.CParsing;
import org.yywang.db.parsing.Parsing;
import org.yywang.dp.factory.ParsingFactory;

public class CParsingFactory implements ParsingFactory {

    @Override
    public Parsing createParsing() {
        return new CParsing();
    }
}
