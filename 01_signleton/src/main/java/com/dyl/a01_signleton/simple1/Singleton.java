package com.dyl.a01_signleton.simple1;

/**
 *  饿汉式 - 单例
 */
public class Singleton {

    //缺点：类加载的时候就创建类对象
    private static  Singleton mInstance  =  new Singleton();

    //1、构造函数私有化
    private Singleton(){}

    //2、返回静态对象
    public static Singleton getmInstance() {
        return mInstance;
    }
}
