package org.yywang;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/**
 *
 */
public class App {

    public static void main(String[] args){
        Face face=new Face("test");
        RoundFaceFeature roundFaceFeature=new RoundFaceFeature();
        SmileMouth smileMouth=new SmileMouth();
        roundFaceFeature.decorator(face);
        smileMouth.decorator(roundFaceFeature);
        smileMouth.show();
    }
}
