package com.asura.mvp_study.mvp4.support.delegate.fragment;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;
import com.asura.mvp_study.mvp4.support.delegate.IMvpDelegateCallback;

/**
 * 扩展目标接口 针对不同的模块，目标接口有差异
 * 
 * @author Dream
 *
 */
public interface IMvpFragmentDelegateCallback<V extends IMvpView, P extends IMvpPresenter<V>>
		extends IMvpDelegateCallback<V, P> {
	
}
