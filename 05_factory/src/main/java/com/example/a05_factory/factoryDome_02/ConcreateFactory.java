package com.example.a05_factory.factoryDome_02;

import com.example.a05_factory.factoryDome_01.Product;

/**
 * 具体工厂类
 */
public class ConcreateFactory extends Factory {
    @Override
    public <T extends Product> T createProdct(Class<T> clz) {
        Product product = null;

        try {
            product = (Product) clz.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
