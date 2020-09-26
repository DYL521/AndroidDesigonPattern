package com.dyl.a01_signleton.simple2;

/**
 * 懒汉模式 - 推荐方式
 */

public class Singleton {

    // 加上volatile 关键字, 有什么作用呢？
    // 1、防止重排序
    // 2、线程可见性- 每个线程可见
    private static volatile Singleton mInstance;

    public Singleton() {
    }


    public static Singleton getInstance() {
        if (mInstance == null) { // 第一次判断对象是否已经存在
            synchronized (Singleton.class) { //加锁，防止多线程的时候两个线程同时执行
                if (mInstance == null) { // 第二次判断； 假设线程1，2，线程1判断为空先创建对象，然后返回；线程2判断已经存在就直接返回
                    mInstance = new Singleton();
                }
            }
            mInstance = new Singleton();
        }
        return mInstance;

    }
}
