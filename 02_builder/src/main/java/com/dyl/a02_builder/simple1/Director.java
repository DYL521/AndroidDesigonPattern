package com.dyl.a02_builder.simple1;

// director类，负责直接构造Computor
public class Director {
    Builder mBuilder = null;


    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }
}
