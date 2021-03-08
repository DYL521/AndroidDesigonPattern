package com.yilu.dyl.a008_asytosyn.CallableFutureThread;

import com.yilu.dyl.a008_asytosyn.futureTask.CustomCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


/**
 * 主线程等待子线程执行完成，再继续执行主线程任务
 */
public class CallableFutureThreadDome {

    public static void main(String[] args) {
        // Callable + FutureTask + Thread
        System.out.println("  main start");
        CustomCallable task = new CustomCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("  main 111");

        try {
            System.out.println("task执行结果:" + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("  main 222:" + i);
        }

        System.out.println("  main 主线程任务执行完毕");
    }
}
