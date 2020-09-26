package com.dyl.desigonpattern.normal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dyl.desigonpattern.R;
import com.dyl.desigonpattern.bean.Account;
import com.dyl.desigonpattern.callback.MCallback;

import java.util.Random;

/**
 *  正常的写法：
 *     这样的写法导致activity承担的任务太多了！非常的臃肿，不好维护
 */
public class NormalActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_result;
    private Button btn_getAccount;
    private EditText et_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        initView();
    }

    private void initView() {
        tv_result = findViewById(R.id.tv_result);
        et_account = findViewById(R.id.et_account);
        findViewById(R.id.btn_getAccount).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String userInput = getUserInput();
        getAccountData(userInput, new MCallback() {
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

    //查询用户数据
    private void getAccountData(String accountName, MCallback callback) {
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
