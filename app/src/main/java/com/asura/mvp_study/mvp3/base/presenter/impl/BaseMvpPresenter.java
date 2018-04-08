package com.asura.mvp_study.mvp3.base.presenter.impl;

import com.asura.mvp_study.mvp3.base.presenter.MvpPresenter;
import com.asura.mvp_study.mvp3.base.view.MvpView;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Created by Asura on 2018/3/26 17:45.
 *         统一管理View 层的绑定和解绑
 */
public abstract class BaseMvpPresenter<V extends MvpView> implements MvpPresenter<V> {

    private WeakReference<V> mWeakView;
    /**
     * 代理View
     */
    private V mProxyView;

    public V getView() {
        return mProxyView;
    }

    /**
     * 绑定视图
     *
     * @param view 视图（Activity、Fragment、View等）
     */
    @SuppressWarnings("unchecked")
    public void attachView(V view) {
        mWeakView = new WeakReference<V>(view);
        ClassLoader classLoader = view.getClass().getClassLoader();
        Class<?>[] interfaces = view.getClass().getInterfaces();
        BaseMvpPresenter.MyInvocationHandler handler = new BaseMvpPresenter.MyInvocationHandler(mWeakView.get());
        mProxyView = (V) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }

    /**
     * 解绑视图
     */
    public void detachView() {
        if (mWeakView != null) {
            mWeakView.clear();
            mWeakView = null;
        }
    }

    /**
     * @return 检查View 对象是否为空
     */
    private boolean isAttachView() {
        return mWeakView != null && mWeakView.get() != null;
    }

    private class MyInvocationHandler implements InvocationHandler {
        private MvpView mView;

        MyInvocationHandler(MvpView view) {
            this.mView = view;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //统一判断View是否为空
            if (!isAttachView()) {
                //不为空，执行回调
                return method.invoke(mView, args);
            }
            //为空，不执行回调
            return null;
        }
    }
}
