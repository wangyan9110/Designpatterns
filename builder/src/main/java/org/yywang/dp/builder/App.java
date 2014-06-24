package org.yywang.dp.builder;

/**
 *
 */
public class App {

    public static void main( String[] args ){

        CarBuilder builder=new JeepCarBuilder();
        CarDirector director=new CarDirector(builder);
        director.construct();

        CarBuilder builder1=new CheryCarBuilder();
        CarDirector director1=new CarDirector(builder1);
        director1.construct();
    }
}
