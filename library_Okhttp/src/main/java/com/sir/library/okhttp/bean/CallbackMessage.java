package com.sir.library.okhttp.bean;

import com.sir.library.okhttp.HttpInfo;
import com.sir.library.okhttp.callback.BaseCallback;

import okhttp3.Call;

/**
 * 响应回调信息体
 *
 * @author zhousf
 */
public class CallbackMessage extends OkMessage {

    public BaseCallback callback;

    public HttpInfo info;

    public Call call;

    public CallbackMessage(int what, BaseCallback callback, HttpInfo info,String requestTag, Call call) {
        this.what = what;
        this.callback = callback;
        this.info = info;
        super.requestTag = requestTag;
        this.call = call;
    }
}