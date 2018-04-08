package com.asura.mvp_study.mvp3.delegate.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.asura.mvp_study.mvp3.base.BaseMvpPresenter;
import com.asura.mvp_study.mvp3.base.BaseMvpView;

/**
 * @author Created by Asura on 2017/10/23 15:23.
 * 第一重代理（生命周期）：代理对象
 * 1、实现目标接口-->可有可无
 * 2、持有目标对象引用-->必须有
 * <p>
 * 第二重代理（绑定和解绑）：目标对象
 * 实现目标接口
 */
public abstract class BaseMvpActivity<V extends BaseMvpView, P extends BaseMvpPresenter<V>>
        extends AppCompatActivity implements BaseMvpView, MvpCallback<V, P> {
    private MvpActivityDelegate<V, P> mMvpActivityDelegateImpl;

    //持有目标对象引用：创建一个
    private MvpActivityDelegate getMvpActivityDelegateImpl() {
        if (mMvpActivityDelegateImpl == null) {
            mMvpActivityDelegateImpl = new MvpActivityDelegateImpl<V, P>(this);
        }
        return mMvpActivityDelegateImpl;
    }

    private P mPresenter;

    @Override
    public P createPresenter() {
        return this.mPresenter;
    }

    @Override
    public P getPresenter() {
        return this.mPresenter;
    }

    @Override
    public void setPresenter(P presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public V getMvpView() {
        return (V) this;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMvpActivityDelegateImpl().onCreate(savedInstanceState);
    }

    @Override
    public void onRestart() {
        super.onRestart();
        getMvpActivityDelegateImpl().onRestart();
    }

    @Override
    public void onStart() {
        super.onStart();
        getMvpActivityDelegateImpl().onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        getMvpActivityDelegateImpl().onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        getMvpActivityDelegateImpl().onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        getMvpActivityDelegateImpl().onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getMvpActivityDelegateImpl().onDestroy();
    }
}
