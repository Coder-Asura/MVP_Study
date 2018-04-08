package com.asura.mvp_study.mvp3.delegate.activity;

import android.os.Bundle;

import com.asura.mvp_study.mvp3.base.BaseMvpPresenter;
import com.asura.mvp_study.mvp3.base.BaseMvpView;

/**
 * @author Created by Asura on 2018/3/28 17:41.
 * 第一重代理（代理生命周期）：目标接口
 */
public interface MvpActivityDelegate<V extends BaseMvpView, P extends BaseMvpPresenter> {
    void onCreate(Bundle savedInstanceState);

    void onRestart();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

}
