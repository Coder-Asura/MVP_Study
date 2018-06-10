package com.asura.mvp_study.mvp4.support.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;
import com.asura.mvp_study.mvp4.support.delegate.fragment.IMvpFragmentDelegate;
import com.asura.mvp_study.mvp4.support.delegate.fragment.IMvpFragmentDelegateCallback;
import com.asura.mvp_study.mvp4.support.delegate.fragment.MvpFragmentDelegateImpl;

public abstract class MvpFragment<V extends IMvpView, P extends IMvpPresenter<V>>
		extends Fragment implements IMvpFragmentDelegateCallback<V, P>, IMvpView {

	private P presenter;

	private IMvpFragmentDelegate<V, P> activityMvpDelegate;

	protected IMvpFragmentDelegate<V, P> getFragmentMvpDelegate() {
		if (this.activityMvpDelegate == null) {
			this.activityMvpDelegate = new MvpFragmentDelegateImpl<V, P>(this);
		}
		return this.activityMvpDelegate;
	}

	@Override
	public P getPresenter() {
		return this.presenter;
	}

	@Override
	public void setPresenter(P presenter) {
		this.presenter = presenter;
	}

	@SuppressWarnings("unchecked")
	@Override
	public V getMvpView() {
		return (V) this;
	}

	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
		getFragmentMvpDelegate().onAttach(context);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getFragmentMvpDelegate().onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		getFragmentMvpDelegate().onActivityCreated(savedInstanceState);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		getFragmentMvpDelegate().onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
		getFragmentMvpDelegate().onStart();
	}

	@Override
	public void onPause() {
		super.onPause();
		getFragmentMvpDelegate().onPause();
	}

	@Override
	public void onResume() {
		super.onResume();
		getFragmentMvpDelegate().onResume();
	}

	@Override
	public void onStop() {
		super.onStop();
		getFragmentMvpDelegate().onStop();
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		getFragmentMvpDelegate().onDestroyView();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		getFragmentMvpDelegate().onDestroy();
	}

	@Override
	public void onDetach() {
		super.onDetach();
		getFragmentMvpDelegate().onDetach();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		getFragmentMvpDelegate().onSaveInstanceState(outState);
	}

	@Override
	public boolean isRetainInstance() {
		return false;
	}

	@Override
	public boolean shouldInstanceBeRetained() {
		return false;
	}

}
