package com.asura.mvp_study.mvp4.test;

import android.os.Bundle;

import com.asura.mvp_study.R;
import com.asura.mvp_study.mvp4.support.view.MvpActivity;


public class MainActivity extends MvpActivity<MainView, MainPresenter> implements MainView{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		getPresenter().register();
	}

	@Override
	public MainPresenter createPresenter() {
		return new MainPresenter(this);
	}

	@Override
	public void onLoginResult(String result) {
		getMvpView().onLoginResult("");
	}

	@Override
	public void onRegisterResult(String result) {
		
	}

}
