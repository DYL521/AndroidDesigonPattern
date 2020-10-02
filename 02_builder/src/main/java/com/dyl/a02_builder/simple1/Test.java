package com.dyl.a02_builder.simple1;


public class Test {
    public static void main(String[] args) {
        // 构造器

        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);

        director.construct("主板", "明基显示器");
        System.out.println("info :  " + builder.create().toString());
    }
}

/**
 * 开发中，我们一般省略Director对象，直接使用一个Builder 来对进行封装，这个Builder通常为链式调用；
 * 关键点在于每个setter方法都返回自身，也就是return this；
 *
 ****/