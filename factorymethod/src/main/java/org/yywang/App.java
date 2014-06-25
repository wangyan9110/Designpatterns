package org.yywang;

import org.yywang.db.parsing.Parsing;
import org.yywang.dp.factory.impl.CParsingFactory;
import org.yywang.dp.factory.ParsingFactory;
import org.yywang.dp.factory.impl.JavaParsingFactory;

public class App {

    public static void main( String[] args ){
        ParsingFactory factory=new CParsingFactory();
        Parsing parsing=factory.createParsing();
        parsing.checkGrammar();
        parsing.parseCode();

        ParsingFactory factory1=new JavaParsingFactory();
        Parsing parsing1=factory1.createParsing();
        parsing1.checkGrammar();
        parsing1.parseCode();
    }
}
