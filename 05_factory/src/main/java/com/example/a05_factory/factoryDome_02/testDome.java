package com.example.a05_factory.factoryDome_02;

import com.example.a05_factory.factoryDome_01.ConcreateProductA;
import com.example.a05_factory.factoryDome_01.Product;

/**
 * 简单工厂模式的实现： 静态工厂类的实现
 */
public class testDome {

    public static void main(String[] args) {

        // 范型 + 反射实现静态工厂模式
        Factory factory = new ConcreateFactory();
        Product product = factory.createProdct(ConcreateProductA.class);
        product.method();
    }
}
