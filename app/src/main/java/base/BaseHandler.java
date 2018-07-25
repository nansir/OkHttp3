package base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/**
 * 通用句柄
 *
 * Created by zhuyinan on 2017/7/7.
 */
public class BaseHandler extends Handler {

    private CallBack callBack;

    public BaseHandler(CallBack callBack, Looper looper) {
        super(looper);
        this.callBack = callBack;
    }

    @Override
    public void handleMessage(Message msg) {
        if (null != callBack) {
            callBack.handleMessage(msg);
        }
    }

    public interface CallBack {
        void handleMessage(Message msg);
    }
}
