package org.yywang.dp.builder;


/**
 *
 */
public abstract class CarBuilder {

    protected Car car=null;

    public abstract void buildWheel();

    public abstract void buildEngine();

    public abstract void buildSteeringWheel();

    public Car getResult(){
        return car;
    }
}
