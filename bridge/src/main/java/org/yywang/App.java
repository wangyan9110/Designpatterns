package org.yywang;

/**
 *
 */
public class App {

    public static void main(String[] args){

        CokeImpl IceCoke=new IceCokeImpl();
        Coke coke=new BigCoke(IceCoke);
        coke.makeCoke();

        Coke bigCoke=new BigCoke(new SugarCokeImpl(),new IceCokeImpl());
        bigCoke.makeCoke();
    }

}
