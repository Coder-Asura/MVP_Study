package com.asura.mvp_study.mvp3.jianshu;

import com.asura.mvp_study.mvp3.base.BaseMvpPresenter;
import com.asura.mvp_study.utils.HttpUtils;

/**
 * @author Created by Asura on 2017/10/23 16:06.
 */
public class JianShuPresenter extends BaseMvpPresenter<JianShuView> {
    private JianShuModel mJianShuModel;

    public JianShuPresenter() {
        mJianShuModel = new JianShuModel();
    }

    public void getData(String word) {
        mJianShuModel.getData(word, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                getView().onResult(result);
            }
        });
    }
}
