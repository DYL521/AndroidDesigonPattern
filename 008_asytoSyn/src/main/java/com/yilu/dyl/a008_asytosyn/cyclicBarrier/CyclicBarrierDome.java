package com.yilu.dyl.a008_asytosyn.cyclicBarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CyclicBarrier ͬ��������: ������һ���߳��໥�ȴ���ֱ������ĳ���������ϵ� common barrier point
 */
public class CyclicBarrierDome {

    public static void main(String[] args) {
        // 1����һ��������ʶ�������10���̵߳�������λ��ʱ���ͻ�ִ�еڶ���Runable�ķ���
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10, new Runnable() {
            @Override
            public void run() {
                System.out.println("��������ִ�������...");
            }
        });
        //2������10������
        List<Runnable> runnables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Runnable runnable = () -> {
                System.out.println("��ǰ�ǵ�" + finalI + "�����񣬿�ʼִ��");
                try {
                    Thread.sleep(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("��ǰ�ǵ�" + finalI + "������ִ�����");
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
         *  ��10������ִ�����֮�󣬾ͻ�ִ�еڶ������ķ���
         */
    }
}
