package com.asura.mvp_study.mvp4.base.presenter;

import com.asura.mvp_study.mvp4.base.view.IMvpView;

/**
 * 抽象为接口
 * 
 * @author Dream
 *
 */
public interface IMvpPresenter<V extends IMvpView> {

	/**
	 * 绑定视图
	 * 
	 * @param view
	 */
	public void attachView(V view);

	/**
	 * 解除绑定
	 */
	public void dettachView();
	
}
