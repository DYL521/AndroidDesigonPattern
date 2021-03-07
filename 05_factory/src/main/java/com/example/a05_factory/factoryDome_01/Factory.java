package com.example.a05_factory.factoryDome_01;


/**
 * 抽象工厂类
 */
public abstract class Factory {

    /**
     * 抽象方法工厂类
     * 具体生产什么，由子类去实现
     *
     * @return
     */
    public abstract Product createProduct();
}
