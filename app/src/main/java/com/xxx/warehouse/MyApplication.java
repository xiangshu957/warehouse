package com.xxx.warehouse;

import android.app.Application;
import android.content.Context;

import com.xxx.warehouse.api.RetrofitApi;
import com.xxx.warehouse.common.SystemConstance;
import com.zrx.mvvmbase.retrofiitwithrxjava.RetrofitManager;
import com.zrx.mvvmbase.utils.PreferenceUtil;

/**
 * @Author: ZhangRuixiang
 * Date: 2021/6/10
 * DES:
 */
public class MyApplication extends Application {

    private static Context applicationContext;

    private static MyApplication pdaApplication;

    public MyApplication() {
    }

    public static MyApplication getInstance() {
        if (pdaApplication == null) {
            synchronized (MyApplication.class) {
                if (pdaApplication == null) {
                    pdaApplication = new MyApplication();
                }
            }
        }
        return pdaApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        applicationContext = getApplicationContext();
        //context，sp文件的名字
        PreferenceUtil.getInstance().init(this, "xx_sp");
        //baseUrl,api接口
        RetrofitManager.getInstance(SystemConstance.BASE_URL, RetrofitApi.class);
    }

    public Context getContext() {

        return applicationContext;
    }

}
