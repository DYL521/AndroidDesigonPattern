package com.yilu.dyl.a008_asytosyn.futureTask;

import java.util.concurrent.Callable;

/**
 * @author DYL
 * <p>
 * �Զ���callable������  ��call���з��ؼ�����
 */
public class CustomCallable implements Callable<Integer> { //Integer ���Է��������Զ������
    @Override
    public Integer call() throws Exception {
        System.out.println("��ʼִ��...");
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            sum += i;
        }
        System.out.println("����ִ��...");
        return sum;
    }
}
