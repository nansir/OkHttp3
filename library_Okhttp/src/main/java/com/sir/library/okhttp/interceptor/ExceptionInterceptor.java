package com.sir.library.okhttp.interceptor;

import com.sir.library.okhttp.HttpInfo;

/**
 * 请求链路异常（非业务逻辑）拦截器
 * Created by zhuyinan on 2017/7/7.
 */
public interface ExceptionInterceptor {
    HttpInfo intercept(HttpInfo info) throws Exception;
}
