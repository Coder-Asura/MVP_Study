package com.asura.mvp_study.mvp1.jianshu;

import com.asura.mvp_study.utils.HttpTask;
import com.asura.mvp_study.utils.HttpUtils;

/**
 * @author Created by Asura on 2017/10/23 16:03.
 */
public class JianShuModel {
    public void getData(String word, final HttpUtils.OnHttpResultListener onHttpResultListener) {
        HttpTask httpTask = new HttpTask(new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                onHttpResultListener.onResult(result);
            }
        });
        httpTask.execute("https://www.jianshu.com/u/" + word);
    }
}
