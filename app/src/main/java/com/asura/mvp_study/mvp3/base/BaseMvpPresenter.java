package com.asura.mvp_study.mvp3.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Created by Asura on 2017/10/23 15:11.
 */
public class BaseMvpPresenter<V extends BaseMvpView> {
    private V mView;
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
    public void attachView(V view) {
        this.mView = view;
        ClassLoader classLoader = mView.getClass().getClassLoader();
        Class<?>[] interfaces = mView.getClass().getInterfaces();
        MyInvocationHandler handler = new MyInvocationHandler(mView);
        mProxyView = (V) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }

    /**
     * 解绑视图
     */
    public void detachView() {
        this.mView = null;
    }

    private boolean isViewNull() {
        return mView == null;
    }

    private class MyInvocationHandler implements InvocationHandler {
        private BaseMvpView mView;

        MyInvocationHandler(BaseMvpView view) {
            this.mView = view;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //统一判断View是否为空
            if (!isViewNull()) {
                //不为空，执行回调
                return method.invoke(mView, args);
            }
            //为空，不执行回调
            return null;
        }
    }
}
