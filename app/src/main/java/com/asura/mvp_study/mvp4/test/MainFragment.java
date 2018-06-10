package com.asura.mvp_study.mvp4.test;


import com.asura.mvp_study.mvp4.support.view.MvpFragment;

public class MainFragment extends MvpFragment<MainView, MainPresenter> {

	@Override
	public MainPresenter createPresenter() {
		return new MainPresenter(getContext());
	}

	@Override
	public boolean isRetainInstance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldInstanceBeRetained() {
		// TODO Auto-generated method stub
		return false;
	}

}
