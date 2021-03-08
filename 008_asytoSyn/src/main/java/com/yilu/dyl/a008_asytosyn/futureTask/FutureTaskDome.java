package com.yilu.dyl.a008_asytosyn.futureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ���̵߳ȴ����߳�ִ����ɣ��ټ���ִ�����߳�����
 */
public class FutureTaskDome {

    public static void main(String[] args) {

        System.out.println("main ��ʼִ��...");
        ExecutorService executorService = Executors.newCachedThreadPool();
        CustomCallable task = new CustomCallable();

        // ���̻߳�һֱ�ȴ�task ִ�н����ִ�������ִ�����̵߳�����
        Future<Integer> result = executorService.submit(task);
        executorService.shutdown();
        System.out.println("main 11 .....");
        try {
            System.out.println("taskִ�н��:" + result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("  main 222:" + i);
        }

        System.out.println("main ���߳�ִ�����...");
        /**
         * main ��ʼִ��...
         * ��ʼִ��...
         * main 11 .....
         * ����ִ��...
         * taskִ�н��:190
         *   main 222:0
         *   main 222:1
         */
    }
}
