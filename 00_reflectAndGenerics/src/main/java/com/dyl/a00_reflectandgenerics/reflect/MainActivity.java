package com.dyl.a00_reflectandgenerics.reflect;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dyl.a00_reflectandgenerics.R;


public class MainActivity extends BaseActivity {
    @ViewById(R.id.tv)
    private TextView tv;
    @ViewById(R.id.tv1)
    private ImageView tv1;
    private int mPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //内部还是使用的finviewByid(),Butterknife内部也是如此
        ViewUtils.inject(this);

        startActivity(new Intent(this,MainActivity.class));

        tv.setText("ViewById");

        startActivity(MainActivity.class);

        /*// 通过反射
        // AssetManager assetManager = new AssetManager();
        // Resources resources = new Resources(,null,null);

        //TestBean testBean = new TestBean();
        // 反射
        try {
            // 创建对象，很多系统的类，都被系统隐藏了，或者说只有系统可以直接 new，可以通过反射创建对象 newInstance() 调用的是无参
            *//*TestBean testBean =  TestBean.class.newInstance();
            testBean.sysName();*//*
            // getDeclaredConstructor 从所有的构造方法里面找， getConstructor  从公共构造方法里面去找
            // 获取一个参数的构造方法 而且参数是String类型
            Constructor constructor = TestBean.class.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);// 设置权限
            // "晴天不改" 调用构造方法传的参数 == new TestBean("晴天不改");
            TestBean testBean = (TestBean) constructor.newInstance("晴天不改");
            //testBean.sysName();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 方法调用
        try {
            *//*TestBean testBean = new TestBean("Darren");
            Method method = TestBean.class.getDeclaredMethod("sysName");
            method.setAccessible(true);
            method.invoke(testBean);*//*

            AssetManager addAssetPath = AssetManager.class.newInstance();
            Method addAssetPathMethod = AssetManager.class.getDeclaredMethod("addAssetPath",String.class);// addAssetPath(String path)
            addAssetPathMethod.invoke(addAssetPath,"sdcard/dds/red.skin");
            // assetManager.addAssetPath();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 获取属性
        try {
            TestBean testBean = new TestBean("baby");
            Field field = TestBean.class.getDeclaredField("name");
            field.setAccessible(true);
            String name = (String) field.get(testBean);
            Log.e("TAG",name);

            Class clazz = Class.forName("android.app.ActivityThread");
            Field sCurrentActivityThreadField =  clazz.getDeclaredField("sCurrentActivityThread");
            sCurrentActivityThreadField.setAccessible(true);
            Object sCurrentActivityThread = sCurrentActivityThreadField.get(null);

            Log.e("TAG",sCurrentActivityThread.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }


}
