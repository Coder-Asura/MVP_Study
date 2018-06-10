package com.asura.mvp_study.mvp4.test.view;

import android.content.Context;
import android.util.AttributeSet;

import com.asura.mvp_study.mvp4.support.view.view.MvpImageView;
import com.asura.mvp_study.mvp4.test.layout.MyPresenter;
import com.asura.mvp_study.mvp4.test.layout.MyView;


public class MyImageView extends MvpImageView<MyView, MyPresenter> implements MyView{

	public MyImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyImageView(Context context) {
		super(context);
	}

	@Override
	public MyPresenter createPresenter() {
		return new MyPresenter(getContext());
	}

	@Override
	public void onResult(String result) {
	}

}
