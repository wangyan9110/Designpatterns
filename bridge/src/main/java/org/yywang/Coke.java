package org.yywang;

/**
 *
 */
public abstract class Coke {


    protected CokeImpl[] cokeImpls;

    public Coke(CokeImpl... cokeimpls){
        this.cokeImpls=cokeimpls;
    }

    public abstract void makeCoke();
}
