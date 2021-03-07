package com.example.a05_factory.factoryDome_01;

public class testDome {
    public static void main(String[] args) {

        // 1、简单实现工厂
        Factory factory = new ConcreateFactory();
        Product p = factory.createProduct();
        p.method();


    }
}