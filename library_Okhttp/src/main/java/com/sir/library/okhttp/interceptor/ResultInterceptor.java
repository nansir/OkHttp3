package com.sir.library.okhttp.interceptor;

import com.sir.library.okhttp.HttpInfo;

/**
 * 请求结果拦截器
 *
 * Created by zhuyinan on 2017/7/7.
 */
public interface ResultInterceptor {

    HttpInfo intercept(HttpInfo info) throws Exception;
}
