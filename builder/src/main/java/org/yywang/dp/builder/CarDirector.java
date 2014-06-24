package org.yywang.dp.builder;

/**
 *
 */
public class CarDirector {

    private CarBuilder builder;

    public CarDirector(CarBuilder builder){
        this.builder=builder;
    }

    public Car construct(){
        builder.buildSteeringWheel();
        builder.buildEngine();
        builder.buildWheel();
        return builder.getResult();
    }
}
