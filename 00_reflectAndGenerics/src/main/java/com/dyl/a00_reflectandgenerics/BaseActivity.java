package com.dyl.a00_reflectandgenerics;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {


    // 上限
    //      表示传递参数必须是BaseActivity 的子类，包括BaseActivity本身
    public void startActivity(Class<? extends BaseActivity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);

    }

    // 下限： 包括MainActivity和它的父类
    //       表示传递的参数，必须是x的超类（包括BaseActivity 本身）
    public void startActivityDown(Class<? super BaseActivity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }


}
