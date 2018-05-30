package com.sir.library.okhttp.interceptor;

import com.sir.library.okhttp.HttpInfo;

/**
 * 请求结果拦截器
 *
 * @author zhousf
 */
public interface ResultInterceptor {

    HttpInfo intercept(HttpInfo info) throws Exception;
}
