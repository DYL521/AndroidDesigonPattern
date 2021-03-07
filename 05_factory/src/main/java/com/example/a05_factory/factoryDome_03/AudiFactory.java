package com.example.a05_factory.factoryDome_03;

/**
 * 工厂类
 */

public abstract class AudiFactory {


    /**
     * 某车型的工厂方法
     *
     * @param clz 具体的suv型号
     * @param <T> 具体型号的suv车对象
     * @return
     */
    public abstract <T extends AudiCar> T crateAudioCar(Class<T> clz);
}
