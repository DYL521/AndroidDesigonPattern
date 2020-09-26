package com.dyl.desigonpattern.callback;

import com.dyl.desigonpattern.bean.Account;

public interface MCallback {

    void onSuccess(Account account);

    void onFailed();

}
