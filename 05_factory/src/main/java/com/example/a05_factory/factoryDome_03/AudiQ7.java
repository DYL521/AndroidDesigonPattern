package com.example.a05_factory.factoryDome_03;

public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q7 启动啦");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7 开始自动巡航");
    }
}
