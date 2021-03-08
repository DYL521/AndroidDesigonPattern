package com.yilu.dyl.a008_asytosyn.countDownLatch;

import java.util.concurrent.CountDownLatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CountDownLatchDome {

    /**
     * 自定义Runable
     */
    private static class CustomRunable implements Runnable {

        /**
         * CountownLatch: 同步工具类，它允许一个或者多个线程一直等待，直到其他线程执行完成再执行
         */
        private CountDownLatch countDownLatch;
        private String name;
        private int delayTime;

        public CustomRunable(CountDownLatch countDownLatch, String name, int delayTime) {
            this.countDownLatch = countDownLatch;
            this.name = name;
            this.delayTime = delayTime;
        }

        @Override
        public void run() {
            System.out.println("开始执行...: " + name);
            try {
                Thread.sleep(delayTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束执行...:" + name);
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    public static void main(String[] args) {

        final CountDownLatch countDownLatch = new CountDownLatch(2);
        Runnable task1 = () -> {
            System.out.println("开始执行:task1 ");
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("执行结束:task1 ");
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // 执行任务
        executorService.submit(task1);
        executorService.submit(new CustomRunable(countDownLatch, "Task2", 3));
        executorService.submit(new CustomRunable(countDownLatch, "Task3", 5));

        // 任务完成后关闭线程池
        executorService.shutdown();
        /**
         *
         * 开始执行:task1
         * 开始执行...: Task2
         * 开始执行...: Task3
         * 结束执行...:Task2
         * 结束执行...:Task3
         * 执行结束:task1
         *
         * 添加了CountDownLatch后，我们做到了让任务Task2和Task3都执行完以后，再继续执行Task1的任务
         */
    }
}
