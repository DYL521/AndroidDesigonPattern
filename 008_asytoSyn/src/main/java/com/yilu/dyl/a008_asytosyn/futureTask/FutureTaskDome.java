package com.yilu.dyl.a008_asytosyn.futureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 主线程等待子线程执行完成，再继续执行主线程任务
 */
public class FutureTaskDome {

    public static void main(String[] args) {

        System.out.println("main 开始执行...");
        ExecutorService executorService = Executors.newCachedThreadPool();
        CustomCallable task = new CustomCallable();

        // 主线程会一直等待task 执行结果，执行完成再执行主线程的任务
        Future<Integer> result = executorService.submit(task);
        executorService.shutdown();
        System.out.println("main 11 .....");
        try {
            System.out.println("task执行结果:" + result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("  main 222:" + i);
        }

        System.out.println("main 主线程执行完毕...");
        /**
         * main 开始执行...
         * 开始执行...
         * main 11 .....
         * 结束执行...
         * task执行结果:190
         *   main 222:0
         *   main 222:1
         */
    }
}
