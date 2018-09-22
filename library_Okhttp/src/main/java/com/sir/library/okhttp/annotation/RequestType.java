package com.sir.library.okhttp.annotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 请求方式
 *
 * Created by zhuyinan on 2017/7/7.
 */
@IntDef({RequestType.POST, RequestType.GET, RequestType.PUT, RequestType.DELETE})
@Retention(RetentionPolicy.SOURCE)
public @interface RequestType {

    /**
     * POST
     */
    int POST = 1;

    /**
     * GET
     */
    int GET = 2;

    /**
     * PUT
     */
    int PUT = 3;

    /**
     * DELETE
     */
    int DELETE = 4;
}