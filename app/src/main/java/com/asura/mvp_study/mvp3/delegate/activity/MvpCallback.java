package com.asura.mvp_study.mvp3.delegate.activity;

import com.asura.mvp_study.mvp3.base.BaseMvpPresenter;
import com.asura.mvp_study.mvp3.base.BaseMvpView;

/**
 * @author Created by Asura on 2018/3/29 10:07.
 * 第二重代理（绑定和解绑）：目标接口
 */
public interface MvpCallback<V extends BaseMvpView, P extends BaseMvpPresenter<V>> {
    P createPresenter();

    P getPresenter();

    void setPresenter(P presenter);

//    V createView();

    V getMvpView();

//    void setMvpView(V view);
}
