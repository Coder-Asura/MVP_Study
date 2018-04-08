package com.asura.mvp_study.mvp3.jianshu;

import com.asura.mvp_study.mvp3.base.BaseMvpView;

/**
 * @author Created by Asura on 2017/10/23 16:06.
 */
public interface JianShuView extends BaseMvpView {
    /**
     * 回调网络请求结果
     *
     * @param result 网络请求结果
     */
    void onResult(String result);
}
