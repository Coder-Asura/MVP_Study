package com.asura.mvp_study.mvp4.support.delegate.view;

import android.content.Context;
import android.os.Parcelable;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;
import com.asura.mvp_study.mvp4.support.delegate.IMvpDelegateCallback;

/**
 * 针对ViewGroup集成MVP代理 目标接口
 * 
 * @author Dream
 *
 * @param <V>
 * @param <P>
 */
public interface IMvpViewDelegateCallback<V extends IMvpView, P extends IMvpPresenter<V>>
		extends IMvpDelegateCallback<V, P> {
	/**
	 * 保存布局实例状态（这里是指布局相关数据）
	 * 
	 * @return
	 */
	public Parcelable superOnSaveInstanceState();

	/**
	 * 恢复布局实例状态
	 * 
	 * @param state
	 */
	public void superOnRestoreInstanceState(Parcelable state);
	
	public Context getSuperContext();
}
