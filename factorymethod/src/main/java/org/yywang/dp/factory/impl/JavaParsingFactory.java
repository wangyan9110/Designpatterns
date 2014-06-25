package org.yywang.dp.factory.impl;

import org.yywang.db.parsing.impl.JavaParsing;
import org.yywang.db.parsing.Parsing;
import org.yywang.dp.factory.ParsingFactory;

public class JavaParsingFactory implements ParsingFactory {

    @Override
    public Parsing createParsing() {
        return new JavaParsing();
    }
}
