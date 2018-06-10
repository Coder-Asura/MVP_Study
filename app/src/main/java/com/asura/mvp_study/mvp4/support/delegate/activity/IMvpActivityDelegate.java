package com.asura.mvp_study.mvp4.support.delegate.activity;

import android.os.Bundle;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;

/**
 * 代理模式－静态代理：定义Activity目标接口
 * 
 * 监听Activity生命周期的方法
 * 
 * @author Dream
 *
 * @param <V>
 * @param <P>
 */
public interface IMvpActivityDelegate<V extends IMvpView, P extends IMvpPresenter<V>> {
	public void onCreate(Bundle savedInstanceState);

	public void onStart();

	public void onPause();

	public void onResume();

	public void onRestart();

	public void onStop();

	public void onDestroy();

	public void onContentChanged();

	public void onSaveInstanceState(Bundle outState);

	public void onAttachedToWindow();
	
	public Object onRetainCustomNonConfigurationInstance();
	
	public Object getLastCustomNonConfigurationInstance();

}
