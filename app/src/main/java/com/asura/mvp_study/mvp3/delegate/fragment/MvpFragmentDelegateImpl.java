package com.asura.mvp_study.mvp3.delegate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asura.mvp_study.mvp3.base.BaseMvpPresenter;
import com.asura.mvp_study.mvp3.base.BaseMvpView;
import com.asura.mvp_study.mvp3.delegate.activity.MvpCallback;
import com.asura.mvp_study.mvp3.delegate.activity.ProxyMvpCallback;

/**
 * @author Created by Asura on 2018/3/29 23:03.
 * 第一重代理（生命周期）：目标接口
 */
public class MvpFragmentDelegateImpl<V extends BaseMvpView, P extends BaseMvpPresenter<V>> implements MvpFragmentDelegate {
    private ProxyMvpCallback<V, P> mProxyMvpCallback;

    public MvpFragmentDelegateImpl(MvpCallback<V, P> mvpCallback) {
        this.mProxyMvpCallback = new ProxyMvpCallback<>(mvpCallback);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        this.mProxyMvpCallback.createPresenter();
        this.mProxyMvpCallback.attachView();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

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
    public void onDestroyView() {

    }

    @Override
    public void onDestroy() {
        mProxyMvpCallback.detachView();
    }
}
