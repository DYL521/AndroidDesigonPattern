package com.yilu.dyl.a008_asytosyn.futureTask;

import java.util.concurrent.Callable;

/**
 * @author DYL
 * <p>
 * 自定义callable方法：  在call房中返回计算结果
 */
public class CustomCallable implements Callable<Integer> { //Integer 可以返回其他自定义的类
    @Override
    public Integer call() throws Exception {
        System.out.println("开始执行...");
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            sum += i;
        }
        System.out.println("结束执行...");
        return sum;
    }
}
