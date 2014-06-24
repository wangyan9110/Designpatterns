package org.yywang.dp.builder;

/**
 *
 */
public class JeepCarBuilder extends CarBuilder {

    @Override
    public void buildWheel() {
        System.out.println("construct jeep car wheel");
    }

    @Override
    public void buildEngine() {
        System.out.println("construct jeep car engine");
    }

    @Override
    public void buildSteeringWheel() {
        System.out.println("construct jeep car steering wheel");
    }
}
