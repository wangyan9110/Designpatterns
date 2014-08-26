package org.yywang;

/**
 *
 */
public class Mouth extends Face {

    private Face face;

    public Mouth(){

    }

    public void decorator(Face face){
        this.face=face;
    }

    @Override
    public void show() {
        face.show();
    }
}
