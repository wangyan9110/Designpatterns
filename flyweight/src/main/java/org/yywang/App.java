package org.yywang;

/**
 * @author wangyan
 * @date 2014-12-19 21:47
 */
public class App {

    public static void main(String[] args){

        ArtWord zhongArtWord=ArtWordFactory.getArtWord("zhong");
        zhongArtWord.layout(new Position(1,2));

        ArtWord guoArtWord=ArtWordFactory.getArtWord("guo");
        guoArtWord.layout(new Position(3,4));

    }
}
