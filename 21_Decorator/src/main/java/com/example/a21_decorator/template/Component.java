package com.example.a21_decorator.template;

/**
 * @author DYL
 * 抽象组件类：
 *     可以是一个接口或者抽象类，就是被装饰的原始对象
 */
public abstract class Component {
    /**
     *  抽象的方法，这个随便增加，根据业务需要
     */
    public abstract void operate();
}
