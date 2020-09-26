package com.dyl.desigonpattern.mvc;

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


/**
 * 演示MVC 的写法
 *
 * 优点：
 *  一定成都上实现model与view的分析，降低了代码的耦合性
 *  activity即使控制器，又要承担部分视图的工作
 *
 * 缺点：
 *  controller与view难以完全结偶，并且随着项目复杂度的提升，controller越来越臃肿
 *
 */
public class MVCActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_result;
    private Button btn_getAccount;
    private EditText et_account;

    private MVCModel mMVCModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        initView();
        mMVCModel = new MVCModel();
    }


    private void initView() {
        tv_result = findViewById(R.id.tv_result);
        et_account = findViewById(R.id.et_account);
        findViewById(R.id.btn_getAccount).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.e("123","onClick");

        //1、通知MVModel获取数据 - 2、MCallback 通知activity
        mMVCModel.getAccountData(getUserInput(), new MCallback() {
            @Override
            public void onSuccess(Account account) {
                showSuccessPage(account);
            }

            @Override
            public void onFailed() {
                showFailesPage();
            }
        });
    }

    //获得用户输入的信息
    private String getUserInput() {
        return et_account.getText().toString();
    }

    //展示获取数据成功的页面
    private void showSuccessPage(Account account) {
        tv_result.setText("用户账号：" + account.getName() + " |"
                + "用户等级： " + account.getLevcel());
    }

    //展示用户数据获取失败的页面
    private void showFailesPage() {
        tv_result.setText("获取数据失败");
    }
}
