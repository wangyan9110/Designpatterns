package org.yywang;

/**
 *
 */
public class SmallCoke extends Coke{

    public SmallCoke(CokeImpl... cokeImpls){
        super(cokeImpls);
    }
    @Override
    public void makeCoke() {
        System.out.println("来一小杯可乐");
        for(CokeImpl cokeImpl:cokeImpls){
            cokeImpl.makeCokeImpl();
        }
    }
}
