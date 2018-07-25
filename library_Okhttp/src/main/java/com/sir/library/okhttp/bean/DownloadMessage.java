package com.sir.library.okhttp.bean;

import com.sir.library.okhttp.HttpInfo;
import com.sir.library.okhttp.callback.ProgressCallback;

/**
 * 下载响应回调信息体
 *
 * Created by zhuyinan on 2017/7/7.
 */
public class DownloadMessage extends OkMessage {

    public String filePath;

    public HttpInfo info;

    public ProgressCallback progressCallback;

    public DownloadMessage(int what, String filePath, HttpInfo info, ProgressCallback progressCallback, String requestTag) {
        this.what = what;
        this.filePath = filePath;
        this.info = info;
        this.progressCallback = progressCallback;
        super.requestTag = requestTag;
    }
}