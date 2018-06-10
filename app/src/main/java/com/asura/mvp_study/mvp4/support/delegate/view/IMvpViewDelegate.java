package com.asura.mvp_study.mvp4.support.delegate.view;

import android.os.Parcelable;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;

/**
 * 以下代理是针对布局的代理
 * 
 * 目标接口
 * 
 * @author Dream
 *
 * @param <V>
 * @param <P>
 */
public interface IMvpViewDelegate<V extends IMvpView, P extends IMvpPresenter<V>> {

	/**
	 * 关联布局
	 * 
	 */
	public void onAttachedToWindow();

	/**
	 * 解除关联
	 */
	public void onDetachedFromWindow();

	/**
	 * 保存布局实例状态（这里是指布局相关数据）
	 * 
	 * @return
	 */
	public Parcelable onSaveInstanceState();

	/**
	 * 恢复布局实例状态
	 * 
	 * @param state
	 */
	public void onRestoreInstanceState(Parcelable state);
}
