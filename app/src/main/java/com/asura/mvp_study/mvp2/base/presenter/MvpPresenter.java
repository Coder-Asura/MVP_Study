package com.asura.mvp_study.mvp2.base.presenter;

import com.asura.mvp_study.mvp2.base.view.MvpView;

/**
 * @author Created by Asura on 2018/3/26 17:42.
 * Present 层接口
 */
public interface MvpPresenter<V extends MvpView> {
    /**
     * 绑定视图
     *
     * @param view 视图
     */
    void attachView(V view);

    /**
     * 解绑视图
     *
     * @param view 视图
     */
    void detachView(V view);

}
