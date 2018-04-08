package com.asura.mvp_study.mvp3.delegate.fragment;

import android.support.v4.app.Fragment;

import com.asura.mvp_study.mvp3.base.BaseMvpPresenter;
import com.asura.mvp_study.mvp3.base.BaseMvpView;
import com.asura.mvp_study.mvp3.delegate.activity.MvpCallback;

/**
 * @author Created by Asura on 2018/3/29 23:03.
 */
public class BaseMvpFragment<V extends BaseMvpView, P extends BaseMvpPresenter<V>> extends Fragment implements BaseMvpView, MvpCallback<V, P> {
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
}
