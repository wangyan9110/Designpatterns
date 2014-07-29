package org.yywang;

/**
 * Created by wangyan on 14-7-29.
 */
public class BigCoke extends Coke {

    public BigCoke(CokeImpl... cokeImpls){
        super(cokeImpls);
    }

    @Override
    public void makeCoke() {
        System.out.println("来一大杯可乐");
        for(CokeImpl cokeImpl :cokeImpls){
            cokeImpl.makeCokeImpl();
        }
    }
}
