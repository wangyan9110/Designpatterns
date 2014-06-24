package org.yywang.dp.builder;

/**
 *
 */
public class CheryCarBuilder extends CarBuilder {

    @Override
    public void buildWheel() {
        System.out.println("construct chery car wheel");
    }

    @Override
    public void buildEngine() {
        System.out.println("construct chery car engine");
    }

    @Override
    public void buildSteeringWheel() {
        System.out.println("construct chery steering wheel");
    }
}
