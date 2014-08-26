package org.yywang;

/**
 * 脸型类
 */
public class FaceFeature extends Face{

    private Face face;

    public FaceFeature(){

    }

    public void decorator(Face face){
        this.face=face;
    }

    @Override
    public void show() {
        face.show();
    }
}
