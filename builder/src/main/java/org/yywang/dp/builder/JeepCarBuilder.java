package org.yywang.dp.builder;

/**
 *
 */
public class JeepCarBuilder extends CarBuilder {

    @Override
    public void buildWheel() {
        System.out.println("build jeep car wheel");
    }

    @Override
    public void buildEngine() {
        System.out.println("build jeep car engine");
    }

    @Override
    public void buildSteeringWheel() {
        System.out.println("build jeep car steering wheel");
    }
}
