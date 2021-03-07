package com.example.a05_factory.factoryDome_03;

public class testDome {

    /**
     * 测试dome
     *
     * @param args
     */

    public static void main(String[] args) {

        AudiFactory factory = new AudiCarFactory();

        AudiQ3 audiQ3 = factory.crateAudioCar(AudiQ3.class);
        audiQ3.drive();
        audiQ3.selfNavigation();


        AudiQ5 audiQ5 = factory.crateAudioCar(AudiQ5.class);
        audiQ5.drive();
        audiQ5.selfNavigation();


        AudiQ7 audiQ7 = factory.crateAudioCar(AudiQ7.class);
        audiQ7.drive();
        audiQ7.selfNavigation();
    }
}
