package com.example.a20_adapter.dome2;

/**
 * @author DYL
 */
public class Dome2 {

    public static void main(String[] args) {


        // 不能实现
        Target target = new ConcreateTarget();
        target.request();

        // 能实现
        Target target1 = new Adapter();
        target1.request();


    }
}
