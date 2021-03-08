package com.yilu.dyl.a008_asytosyn.countDownLatch;

import java.util.concurrent.CountDownLatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CountDownLatchDome {

    /**
     * �Զ���Runable
     */
    private static class CustomRunable implements Runnable {

        /**
         * CountownLatch: ͬ�������࣬������һ�����߶���߳�һֱ�ȴ���ֱ�������߳�ִ�������ִ��
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
            System.out.println("��ʼִ��...: " + name);
            try {
                Thread.sleep(delayTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("����ִ��...:" + name);
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    public static void main(String[] args) {

        final CountDownLatch countDownLatch = new CountDownLatch(2);
        Runnable task1 = () -> {
            System.out.println("��ʼִ��:task1 ");
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ִ�н���:task1 ");
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        // ִ������
        executorService.submit(task1);
        executorService.submit(new CustomRunable(countDownLatch, "Task2", 3));
        executorService.submit(new CustomRunable(countDownLatch, "Task3", 5));

        // ������ɺ�ر��̳߳�
        executorService.shutdown();
        /**
         *
         * ��ʼִ��:task1
         * ��ʼִ��...: Task2
         * ��ʼִ��...: Task3
         * ����ִ��...:Task2
         * ����ִ��...:Task3
         * ִ�н���:task1
         *
         * �����CountDownLatch������������������Task2��Task3��ִ�����Ժ��ټ���ִ��Task1������
         */
    }
}
