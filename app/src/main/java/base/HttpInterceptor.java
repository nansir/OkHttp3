package base;

import com.sir.library.okhttp.HttpInfo;
import com.sir.library.okhttp.interceptor.ExceptionInterceptor;
import com.sir.library.okhttp.interceptor.ResultInterceptor;

/**
 * Http拦截器
 * 1、请求结果统一预处理拦截器
 * 2、请求链路异常信息拦截器
 *
 * Created by zhuyinan on 2017/7/7.
 */
public class HttpInterceptor {
    /**
     * 请求结果统一预处理拦截器
     * 该拦截器会对所有网络请求返回结果进行预处理并修改
     */
    public static ResultInterceptor resultInterceptor = new ResultInterceptor() {
        @Override
        public HttpInfo intercept(HttpInfo info) throws Exception {
            //请求结果预处理
            return info;
        }
    };

    /**
     * 请求链路异常信息拦截器
     * 该拦截器会发送网络请求时链路异常信息进行拦截处理
     */
    public static ExceptionInterceptor exceptionInterceptor = new ExceptionInterceptor() {
        @Override
        public HttpInfo intercept(HttpInfo info) throws Exception {
            String result = info.getRetDetail();
            switch (info.getRetCode()) {
                case HttpInfo.NonNetwork:
                    info.setRetDetail("网络中断：" + result);
                    break;
                case HttpInfo.CheckURL:
                    info.setRetDetail("网络地址错误[" + info.getNetCode() + "]：" + result);
                    break;
                case HttpInfo.CheckNet:
                    info.setRetDetail("请检查网络连接是否正常[" + info.getNetCode() + "]：" + result);
                    break;
                case HttpInfo.ProtocolException:
                    info.setRetDetail("协议类型错误[" + info.getNetCode() + "]：" + result);
                    break;
                case HttpInfo.ConnectionTimeOut:
                    info.setRetDetail("连接超时：" + result);
                    break;
                case HttpInfo.WriteAndReadTimeOut:
                    info.setRetDetail("读写超时：" + result);
                    break;
                case HttpInfo.ConnectionInterruption:
                    info.setRetDetail("连接中断：" + result);
                    break;
                case HttpInfo.PermissionToExpire:
                    info.setRetDetail("许可到期");
                    break;
            }
            return info;
        }
    };


}
