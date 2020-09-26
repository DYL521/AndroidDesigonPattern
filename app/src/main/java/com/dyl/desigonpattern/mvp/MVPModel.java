package com.dyl.desigonpattern.mvp;

import com.dyl.desigonpattern.bean.Account;
import com.dyl.desigonpattern.callback.MCallback;

import java.util.Random;

public class MVPModel {



    //查询用户数据
    public void getAccountData(String accountName, MCallback callback) {
        Random random = new Random();
        boolean isSuccess = random.nextBoolean();
        if (isSuccess) {
            Account account = new Account();
            account.setLevcel(11);
            account.setName("xxxxx");
            callback.onSuccess(account);
        } else {
            callback.onFailed();
        }
    }
}
