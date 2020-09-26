package com.dyl.desigonpattern.mvp;

import com.dyl.desigonpattern.bean.Account;

public interface IMVPView {

    //获得用户输入的信息
    String getUserInput();

    //展示获取数据成功的页面
    void showSuccessPage(Account account);

    //展示用户数据获取失败的页面
    void showFailesPage();
}
