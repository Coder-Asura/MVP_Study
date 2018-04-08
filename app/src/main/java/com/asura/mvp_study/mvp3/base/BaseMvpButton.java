package com.asura.mvp_study.mvp3.base;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

/**
 * @author Created by Asura on 2017/10/23 16:59.
 */
public abstract class BaseMvpButton<V extends BaseMvpView, P extends BaseMvpPresenter> extends AppCompatButton implements BaseMvpView {
    private P mPresenter;

    public P getPresenter() {
        return mPresenter;
    }

    public BaseMvpButton(Context context) {
        super(context);
    }

    public BaseMvpButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseMvpButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    protected abstract P createPresenter();
}
