package com.sir.library.okhttp.callback;

import com.sir.library.okhttp.HttpInfo;

import java.io.IOException;

/**
 * 异步请求回调接口
 *
 * @author zhousf
 */
public interface Callback extends BaseCallback {

    /**
     * 请求成功：该回调方法已切换到UI线程
     */
    void onSuccess(HttpInfo info) throws IOException;

    /**
     * 请求失败：该回调方法已切换到UI线程
     */
    void onFailure(HttpInfo info) throws IOException;

}
