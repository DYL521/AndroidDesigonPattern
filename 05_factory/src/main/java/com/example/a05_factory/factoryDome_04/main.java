package com.example.a05_factory.factoryDome_04;

/**
 * @author DYL
 */
public class main {

    public static void main(String[] args) {

        // 1、文件查询
        IOhandler handler = IOFactory.getIOHandler(FileHandler.class);
        handler.query("111");

        // 2、xml查询
        IOhandler handler2 = IOFactory.getIOHandler(XMLHandler.class);
        handler2.add("1","我是python");

    }
}
