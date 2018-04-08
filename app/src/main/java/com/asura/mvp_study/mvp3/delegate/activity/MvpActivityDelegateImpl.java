package com.asura.mvp_study.mvp3.delegate.activity;

import android.os.Bundle;

import com.asura.mvp_study.mvp3.base.BaseMvpPresenter;
import com.asura.mvp_study.mvp3.base.BaseMvpView;

/**
 * @author Created by Asura on 2018/3/28 17:46.
 * 第一重代理（代理生命周期）：目标对象
 */
public class MvpActivityDelegateImpl<V extends BaseMvpView, P extends BaseMvpPresenter<V>> implements MvpActivityDelegate<V, P> {

    private ProxyMvpCallback<V, P> mProxyMvpCallback;

    public MvpActivityDelegateImpl(MvpCallback<V, P> mvpCallback) {
        this.mProxyMvpCallback = new ProxyMvpCallback<V, P>(mvpCallback);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //绑定视图
        mProxyMvpCallback.createPresenter();
        mProxyMvpCallback.attachView();
    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {
        //解绑视图
        mProxyMvpCallback.detachView();
    }
}
