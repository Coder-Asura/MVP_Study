package com.asura.mvp_study.mvp1.jianshu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.asura.mvp_study.R;
import com.asura.mvp_study.mvp1.base.BaseMvpFragment;

/**
 * @author Created by Asura on 2017/10/23 16:51.
 */
public class JianShuFragment extends BaseMvpFragment<JianShuView, JianShuPresenter> implements JianShuView {
    @Override
    public JianShuPresenter createPresenter() {
        return new JianShuPresenter();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_jianshu, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_getJianshu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().getData("f22d6bddfd1c");
            }
        });
    }

    @Override
    public void onResult(String result) {
        Toast.makeText(getContext(), result, Toast.LENGTH_LONG).show();
    }
}
