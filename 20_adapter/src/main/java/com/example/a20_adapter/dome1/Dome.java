package com.example.a20_adapter.dome1;

/**
 *  适配器模式
 * @author DYL
 */

// 定义： 就是把一个类的接口变换城客户端做期待的另一种接口，从而使原本接口不匹配而无法一起工作的类，一起工作

/**
 *  使用的场景：
 *          1、系统需要使用现有的类，而此类的接口不符合系统的需要，即接口不兼容
 *          2、建立一个重复使用的类，用于接口之间彼此之间没有太大的关联，包括一些可能在姜凯引进的类一起工作
 *          3、需要一个统一输出的接口，但是输入端的类型不可预知
 *
 *
 *    任何问题都可以加一个中间层的接口转换达到兼容的目的
 *
 */
public class Dome {

    public static void main(String[] args) {

        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压： "+ adapter.getVolt5());

    }

}
