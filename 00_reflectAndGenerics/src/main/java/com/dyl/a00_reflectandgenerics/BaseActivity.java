package com.dyl.a00_reflectandgenerics;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {


    // 上限
    public void startActivity(Class<? extends BaseActivity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);

    }

    // 下限： 包括MainActivity和它的父类
    public void startActivityDown(Class<? super BaseActivity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }


}
