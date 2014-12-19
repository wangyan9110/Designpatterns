package org.yywang;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangyan
 * @date 2014-12-19 21:23
 */
public class ArtWordFactory {

    private static Map<String,ArtWord> artWordMap=new HashMap<String, ArtWord>();

    public static ArtWord getArtWord(String word){
        ArtWord artWord=artWordMap.get(word);
        if(artWord==null){
            if(word.equals("zhong")){
                artWord=new ZhongArtWord();
                artWordMap.put("zhong",artWord);
            }else if(word.equals("guo")){
                artWord=new GuoArtWord();
                artWordMap.put("guo",artWord);
            }
        }
        return artWord;
    }
}
