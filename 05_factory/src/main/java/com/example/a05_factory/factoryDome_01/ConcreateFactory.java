package com.example.a05_factory.factoryDome_01;

/**
 * 具体工厂类
 */
public class ConcreateFactory extends Factory {

    @Override
    public Product createProduct() {
        //想实现就直接返回对应的实例
        return new ConcreateProductA();
    }
}
