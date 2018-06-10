package com.asura.mvp_study.mvp4.support.view.layout;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.asura.mvp_study.mvp4.base.presenter.IMvpPresenter;
import com.asura.mvp_study.mvp4.base.view.IMvpView;
import com.asura.mvp_study.mvp4.support.delegate.viewgroup.IMvpViewGroupDelegateCallback;
import com.asura.mvp_study.mvp4.support.delegate.viewgroup.MvpViewGroupDelegateImpl;

/**
 * 以下代理是针对布局的代理 代理对象
 * 
 * 代理对象持有目标对象的引用
 * 
 * @author Dream
 *
 */
public abstract class MvpLinearLayout<V extends IMvpView, P extends IMvpPresenter<V>>
		extends LinearLayout implements IMvpViewGroupDelegateCallback<V, P>,
		IMvpView {

	private MvpViewGroupDelegateImpl<V, P> mvpDelegateImpl;

	private P presenter;
	
	private boolean isRetainInstance;

	public MvpLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MvpLinearLayout(Context context) {
		super(context);
	}

	private MvpViewGroupDelegateImpl<V, P> getMvpDelegate() {
		if (mvpDelegateImpl == null) {
			mvpDelegateImpl = new MvpViewGroupDelegateImpl<V, P>(this);
		}
		return mvpDelegateImpl;
	}

	@Override
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		getMvpDelegate().onAttachedToWindow();
	}

	@Override
	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		getMvpDelegate().onDetachedFromWindow();
	}

	@Override
	protected Parcelable onSaveInstanceState() {
		return getMvpDelegate().onSaveInstanceState();
	}

	@Override
	protected void onRestoreInstanceState(Parcelable state) {
		getMvpDelegate().onRestoreInstanceState(state);
	}

	@Override
	public P getPresenter() {
		return this.presenter;
	}

	@Override
	public void setPresenter(P presenter) {
		this.presenter = presenter;
	}

	@Override
	public V getMvpView() {
		return (V) this;
	}

	@Override
	public void setRetainInstance(boolean retaionInstance) {
		this.isRetainInstance = retaionInstance;
	}

	@Override
	public boolean isRetainInstance() {
		return this.isRetainInstance;
	}

	@Override
	public boolean shouldInstanceBeRetained() {
		return this.isRetainInstance;
	}

	@Override
	public Parcelable superOnSaveInstanceState() {
		return super.onSaveInstanceState();
	}

	@Override
	public void superOnRestoreInstanceState(Parcelable state) {
		super.onRestoreInstanceState(state);
	}

	@Override
	public Context getSuperContext() {
		return getContext();
	}

}
