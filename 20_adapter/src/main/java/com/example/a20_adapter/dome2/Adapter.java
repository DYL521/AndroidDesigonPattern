package com.example.a20_adapter.dome2;

/**
 * @author DYL
 * <p>
 * <p>
 * 实现 Target 接口，同时继承了 Adaptee 类，
 * 然后在实现的 request() 方法中调用父类的 adapteeRequest() 即可实现
 */
public class Adapter extends Adaptee implements Target {


    @Override
    public void request() {
        System.out.println("输出一些操作...");
        super.adapterRequest(); // 夫类的方法
        System.out.println("输出一些操作2...");
    }
}
