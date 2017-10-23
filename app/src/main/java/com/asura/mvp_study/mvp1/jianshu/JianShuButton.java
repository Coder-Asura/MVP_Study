package com.asura.mvp_study.mvp1.jianshu;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import com.asura.mvp_study.mvp1.base.BaseMvpButton;

/**
 * @author Created by Asura on 2017/10/23 16:59.
 */
public class JianShuButton extends BaseMvpButton<JianShuView, JianShuPresenter> implements JianShuView {
    public JianShuButton(Context context) {
        super(context);
    }

    public JianShuButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public JianShuButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setOnClickListener(@Nullable final OnClickListener l) {
        super.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().getData("f22d6bddfd1c");
                if (l != null) {
                    //回调回去
                    l.onClick(v);
                }
            }
        });
    }

    @Override
    public void onResult(String result) {
        Toast.makeText(getContext(), result, Toast.LENGTH_LONG).show();
    }

    @Override
    protected JianShuPresenter createPresenter() {
        return new JianShuPresenter();
    }
}
