package com.dyl.a02_builder.simple1;

// 计算机抽象类
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){

    }

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    // 设置操作系统
    public abstract void setmOS();

    @Override
    public String toString() {
        return "Compulter{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
