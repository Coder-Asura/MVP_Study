package com.asura.mvp_study.mvp3.delegate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Created by Asura on 2018/3/29 23:03.
 * 第一重代理（生命周期）：目标接口
 */
public interface MvpFragmentDelegate {
    void onCreate(@Nullable Bundle savedInstanceState);

    View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    void onViewCreated(View view, @Nullable Bundle savedInstanceState);

    void onSaveInstanceState(Bundle outState);

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroyView();

    void onDestroy();
}
