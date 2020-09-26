package com.dyl.desigonpattern.mvp;

import com.dyl.desigonpattern.bean.Account;
import com.dyl.desigonpattern.callback.MCallback;

public class MVPPresenter {

    private IMVPView mView;
    private MVPModel mModel;

    public MVPPresenter(IMVPView mView) {
        this.mView = mView;
        mModel = new MVPModel();
    }


    public void getData(String accountname) {
        // 通知model，获取数据
        mModel.getAccountData(accountname, new MCallback() {
            @Override
            public void onSuccess(Account account) {
                mView.showSuccessPage(account);
            }

            @Override
            public void onFailed() {
                mView.showFailesPage();
            }
        });

    }
}
