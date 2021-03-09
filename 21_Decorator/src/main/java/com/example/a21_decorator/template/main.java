package com.example.a21_decorator.template;

/**
 * @author DYL
 * <p>
 * <p>
 * 装饰器模式，也叫包装模式：Wrapper Pattern, 结构性设计模式之一
 * <p>
 * 动态给对象添加一些额外的职责
 */
public class main {

    public static void main(String[] args) {

        //1、构造被装饰的组件对象
        Component component = new ConcreateComponent();

        //2、根据组件对象构造装饰器对象A，相当于给组件对象增加装饰器A的功能和方法
        Decorator decorator = new ConcreateDecoratorA(component);
        decorator.operate();


        Decorator decoratorB = new ConcreateDecoratorB(component);
        decoratorB.operate();

    }


}