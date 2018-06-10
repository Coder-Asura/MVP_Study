package com.asura.mvp_study.mvp4.support.delegate.activity;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;

public class MvpActivityConfigurationInstance<V extends IMvpView, P extends IMvpPresenter<V>> {
	private P presenter;
	private Object customeConfigurationInstance;

	public MvpActivityConfigurationInstance(P presenter,
											Object customeConfigurationInstance) {
		super();
		this.presenter = presenter;
		this.customeConfigurationInstance = customeConfigurationInstance;
	}

	public P getPresenter() {
		return presenter;
	}

	public void setPresenter(P presenter) {
		this.presenter = presenter;
	}

	public Object getCustomeConfigurationInstance() {
		return customeConfigurationInstance;
	}

	public void setCustomeConfigurationInstance(
			Object customeConfigurationInstance) {
		this.customeConfigurationInstance = customeConfigurationInstance;
	}

}
