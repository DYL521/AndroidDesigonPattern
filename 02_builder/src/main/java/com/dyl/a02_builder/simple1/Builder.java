package com.dyl.a02_builder.simple1;


// 抽象Builder类
public abstract class Builder {

    // 设置主机
    public abstract void buildBoard(String board);

    //设置显示器
    public abstract void buildDisplay(String display);

    //设置操作系统
    public abstract void buildOs();

    //创建Computer
    public abstract Computer create();
}
