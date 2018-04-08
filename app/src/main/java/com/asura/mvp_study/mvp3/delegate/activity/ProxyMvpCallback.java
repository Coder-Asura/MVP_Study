package com.asura.mvp_study.mvp3.delegate.activity;

import android.util.Log;

import com.asura.mvp_study.mvp3.base.BaseMvpPresenter;
import com.asura.mvp_study.mvp3.base.BaseMvpView;

/**
 * @author Created by Asura on 2018/3/29 10:19.
 * 第二重代理（绑定和解绑）：代理对象
 * 1、实现目标接口-->可有可无
 * 2、持有目标对象引用-->必须有
 */
public class ProxyMvpCallback<V extends BaseMvpView, P extends BaseMvpPresenter<V>> implements MvpCallback<V, P> {
    private MvpCallback<V, P> mMvpCallback;

    //持有目标对象引用
    public ProxyMvpCallback(MvpCallback<V, P> mvpCallback) {
        this.mMvpCallback = mvpCallback;
    }

    @Override
    public P createPresenter() {
        P presenter = mMvpCallback.getPresenter();
        if (presenter == null) {
            presenter = mMvpCallback.createPresenter();
        }
        if (presenter == null) {
            throw new NullPointerException("presenter can not be null !");
        }
        mMvpCallback.setPresenter(presenter);
        return presenter;
    }

    @Override
    public P getPresenter() {
        P presenter = mMvpCallback.getPresenter();
        if (presenter == null) {
            throw new NullPointerException("presenter can not be null !");
        }
        return presenter;
    }

    @Override
    public void setPresenter(P presenter) {
        mMvpCallback.setPresenter(presenter);
    }

    @Override
    public V getMvpView() {
        V view = mMvpCallback.getMvpView();
        if (view == null) {
            throw new NullPointerException("view can not be null !");
        }
        return view;
    }

    public void attachView() {
        getPresenter().attachView(getMvpView());
    }

    public void detachView() {
        Log.i("main", "解除绑定");
        getPresenter().detachView();
    }
}
