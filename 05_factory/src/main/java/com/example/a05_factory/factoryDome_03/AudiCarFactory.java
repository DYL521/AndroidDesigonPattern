package com.example.a05_factory.factoryDome_03;

public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T crateAudioCar(Class<T> clz) {

        AudiCar car = null;
        try {
            car = (AudiCar) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
