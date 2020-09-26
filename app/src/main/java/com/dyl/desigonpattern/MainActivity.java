package com.dyl.desigonpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dyl.desigonpattern.mvc.MVCActivity;
import com.dyl.desigonpattern.mvp.MVPActivity;
import com.dyl.desigonpattern.normal.NormalActivity;


/**
 * mvp 演示
 *
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this, NormalActivity.class));
//                startActivity(new Intent(MainActivity.this, MVCActivity.class));
                startActivity(new Intent(MainActivity.this, MVPActivity.class));
            }
        });
    }
}
