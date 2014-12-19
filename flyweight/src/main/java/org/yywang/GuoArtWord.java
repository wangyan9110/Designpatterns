package org.yywang;

/**
 * @author wangyan
 * @date 2014-12-19 21:27
 */
public class GuoArtWord implements ArtWord {


    @Override
    public void layout(Position position) {
        System.out.println("国的位置："+position.getX()+" "+position.getY());
    }
}
