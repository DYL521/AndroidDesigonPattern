package com.yilu.dyl.a008_asytosyn.cyclicBarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CyclicBarrier 同步辅助类: 它允许一组线程相互等待，直到到达某个公共屏障点 common barrier point
 */
public class CyclicBarrierDome {

    public static void main(String[] args) {
        // 1、第一个参数标识如果到达10个线程到达屏障位置时，就会执行第二个Runable的方法
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10, new Runnable() {
            @Override
            public void run() {
                System.out.println("所有任务都执行完毕了...");
            }
        });
        //2、创建10个任务
        List<Runnable> runnables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Runnable runnable = () -> {
                System.out.println("当前是第" + finalI + "个任务，开始执行");
                try {
                    Thread.sleep(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前是第" + finalI + "个任务，执行完毕");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            };
            runnables.add(runnable);
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (Runnable r : runnables) {
            executorService.submit(r);
        }
        executorService.shutdown();
        /**
         *  当10个任务执行完毕之后，就会执行第二函数的方法
         */
    }
}
