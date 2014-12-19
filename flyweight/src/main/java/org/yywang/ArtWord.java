package org.yywang;

/**
 * @author wangyan
 * @date 2014-12-19 21:27
 */
public interface ArtWord {

    /**
     * 不同艺术字布局不共享
     * @param position 位置
     */
    void layout(Position position);
}
