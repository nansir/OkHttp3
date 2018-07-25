package com.sir.library.okhttp.callback;

import com.sir.library.okhttp.HttpInfo;

/**
 * 进度回调抽象类
 * Created by zhuyinan on 2017/7/7.
 */
public abstract class BaseProgressCallback {

    public abstract void onResponseMain(String filePath, HttpInfo info);

    public abstract void onResponseSync(String filePath, HttpInfo info);

    public abstract void onProgressAsync(int percent, long bytesWritten, long contentLength, boolean done);

    public abstract void onProgressMain(int percent, long bytesWritten, long contentLength, boolean done);

}
