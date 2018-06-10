package com.asura.mvp_study.mvp4.support.delegate;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;

/**
 * 代理模式－静态代理：目标接口
 * 
 * 
 * @author Dream
 *
 * @param <V>
 * @param <P>
 */
public interface IMvpDelegateCallback<V extends IMvpView, P extends IMvpPresenter<V>> {
	/**
	 * 创建Presenter方法
	 * 
	 * @return
	 */
	public P createPresenter();

	/**
	 * 得到Presenter实例
	 * 
	 * @return
	 */
	public P getPresenter();

	/**
	 * 设置一个新的Presenter
	 * 
	 * @param presenter
	 */
	public void setPresenter(P presenter);

	/**
	 * 得到具体的MvpView实例对象
	 * 
	 * @return
	 */
	public V getMvpView();
	
	//是否保存数据
	public void setRetainInstance(boolean retaionInstance);
	public boolean isRetainInstance();
	
	//判断是否保存数据(该方法还会处理横竖屏切换)
	public boolean shouldInstanceBeRetained();
	
}
