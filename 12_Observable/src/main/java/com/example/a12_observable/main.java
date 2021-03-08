package com.example.a12_observable;


public class main {

    public static void main(String[] args) {
        // 被观察者的角色
        DevTechFrontier devTechFrontier = new DevTechFrontier();

        //观察者
        Coder mrsimple = new Coder("mr.simple");
        Coder coder1 = new Coder("code1");
        Coder coder2 = new Coder("code2");
        Coder coder3 = new Coder("code3");

        //将观察者注册到观察者列表中
        devTechFrontier.addObserver(mrsimple);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        //发布消息
        devTechFrontier.postNewPublication("特斯拉新款发布啦。。。");
    }
}