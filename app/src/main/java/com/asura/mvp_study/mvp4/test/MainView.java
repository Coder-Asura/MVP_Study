package com.asura.mvp_study.mvp4.test;

import com.asura.mvp_study.mvp4.base.view.IMvpView;

public interface MainView extends IMvpView {
	public void onLoginResult(String result);
	
	//只需在该接口中添加相应功能接口即可
	public void onRegisterResult(String result);
}
