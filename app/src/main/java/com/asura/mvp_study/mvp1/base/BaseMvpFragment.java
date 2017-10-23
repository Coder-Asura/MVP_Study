package com.asura.mvp_study.mvp1.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * @author Created by Liuxd on 2017/10/23 14:33.
 */
public abstract class BaseMvpFragment<V extends BaseMvpView, P extends BaseMvpPresenter> extends Fragment implements BaseMvpView {
    private P mPresenter;

    public P getPresenter() {
        return mPresenter;
    }

    /**
     * 创建 Presenter
     *
     * @return Presenter
     */
    public abstract P createPresenter();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }
}
