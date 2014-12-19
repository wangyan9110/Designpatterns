package org.yywang;

/**
 * @author wangyan
 * @date 2014-12-19 21:30
 */
public class ZhongArtWord implements ArtWord {

    @Override
    public void layout(Position position) {
        System.out.println("中的位置："+position.getX()+" "+position.getY());
    }
}
