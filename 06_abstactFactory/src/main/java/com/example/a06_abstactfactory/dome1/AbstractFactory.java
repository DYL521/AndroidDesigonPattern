package com.example.a06_abstactfactory.dome1;

/**
 * @author DYL
 */
public abstract class AbstractFactory {

    /**
     *  创建产品A的产品
     * @return
     */
    public abstract AbstractProductA createProductA();


    /**
     * 创建产品B的产品
     * @return
     */
    public abstract AbstractProductB createProductB();

}
