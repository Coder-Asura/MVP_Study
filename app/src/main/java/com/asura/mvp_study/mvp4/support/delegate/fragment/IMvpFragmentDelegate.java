package com.asura.mvp_study.mvp4.support.delegate.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;

public interface IMvpFragmentDelegate<V extends IMvpView, P extends IMvpPresenter<V>> {
	public void onCreate(Bundle savedInstanceState);

	public void onActivityCreated(Bundle savedInstanceState);

	public void onViewCreated(View view, Bundle savedInstanceState);

	public void onStart();

	public void onPause();

	public void onResume();

	public void onStop();

	public void onDestroyView();

	public void onDestroy();

	public void onSaveInstanceState(Bundle outState);

	public void onAttach(Context context);

	public void onDetach();
}
