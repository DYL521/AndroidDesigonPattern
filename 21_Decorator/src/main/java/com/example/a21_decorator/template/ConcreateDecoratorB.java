package com.example.a21_decorator.template;

/**
 * @author DYL
 */
public class ConcreateDecoratorB extends Decorator{
    /**
     * 必要的构造方法，需要一个Component的引用
     *
     * @param component
     */
    protected ConcreateDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operaA();
        super.operate();
        operaB();
    }

    /**
     * 自定义装饰器方法A
     */
    private void operaA(){
        System.out.println("自定义装饰器A....");
    }

    /**
     * 自定义装饰器B
     */
    private void operaB(){
        System.out.println("自定义装饰器B....");
    }
}
