package com.asura.mvp_study.mvp4.test;

import android.content.Context;

import com.asura.mvp_study.mvp4.base.presenter.impl.BaseMvpPresenter;

public class MainPresenter extends BaseMvpPresenter<MainView> {
	
	private RegisterModel registerModel;

	public MainPresenter(Context context) {
		super(context);
		registerModel = new RegisterModel();
	}

	public void register(){
		
	}

}
