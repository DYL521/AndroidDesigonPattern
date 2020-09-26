package com.dyl.desigonpattern.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dyl.desigonpattern.R;
import com.dyl.desigonpattern.bean.Account;
import com.dyl.desigonpattern.callback.MCallback;

public class MVPActivity extends AppCompatActivity implements View.OnClickListener,IMVPView {

    private TextView tv_result;
    private Button btn_getAccount;
    private EditText et_account;

    private MVPPresenter mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        initView();
        mvpPresenter = new MVPPresenter(this); //因为MVPActivit实现了IMVPView接口，view就完成了初始化
    }

    private void initView() {
        tv_result = findViewById(R.id.tv_result);
        et_account = findViewById(R.id.et_account);
        findViewById(R.id.btn_getAccount).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        mvpPresenter.getData(getUserInput());
    }

    @Override
    public String getUserInput() {
        return et_account.getText().toString();
    }

    @Override
    public void showSuccessPage(Account account) {
        tv_result.setText("用户账号：" + account.getName() + " |"
                + "用户等级： " + account.getLevcel());
    }

    @Override
    public void showFailesPage() {
        tv_result.setText("获取数据失败");
    }
}
