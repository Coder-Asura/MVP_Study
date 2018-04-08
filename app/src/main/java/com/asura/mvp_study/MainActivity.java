package com.asura.mvp_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * @author Asura
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton1, mButton2, mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1 = findViewById(R.id.btn_mvp1);
        mButton2 = findViewById(R.id.btn_mvp2);
        mButton3 = findViewById(R.id.btn_mvp3);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_mvp1:
                intent.setClass(MainActivity.this, com.asura.mvp_study.mvp1.jianshu.JianShuActivity.class);
                break;
            case R.id.btn_mvp2:
                intent.setClass(MainActivity.this, com.asura.mvp_study.mvp2.jianshu.JianShuActivity.class);
                break;
            case R.id.btn_mvp3:
                intent.setClass(MainActivity.this, com.asura.mvp_study.mvp3.jianshu.JianShuActivity.class);
                break;
            default:
        }
        startActivity(intent);
    }
}
