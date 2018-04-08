package com.asura.mvp_study.mvp3.jianshu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.asura.mvp_study.R;
import com.asura.mvp_study.mvp2.jianshu.JianShuButton;
import com.asura.mvp_study.mvp3.delegate.activity.BaseMvpActivity;

/**
 * @author Created by Asura on 2018/3/29 21:28.
 */
public class JianShuActivity extends BaseMvpActivity<JianShuView, JianShuPresenter> implements JianShuView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jianshu3);
        ((JianShuButton) findViewById(R.id.jsbtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("asura", "点击了");
            }
        });
    }

    @Override
    public JianShuPresenter createPresenter() {
        return new JianShuPresenter();
    }

    @Override
    public void onResult(String result) {
        Toast.makeText(JianShuActivity.this, result, Toast.LENGTH_LONG).show();
    }

    public void getJianShuData(View view) {
        getPresenter().getData("f22d6bddfd1c");
    }
}
