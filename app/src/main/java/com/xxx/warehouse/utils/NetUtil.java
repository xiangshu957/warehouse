package com.xxx.warehouse.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.xxx.warehouse.MyApplication;


/**
 * @Author: ZhangRuixiang
 * Date: 2021/1/14
 * DES:
 */
public class NetUtil {

    public static boolean isNetConnect() {
        ConnectivityManager connectivityManager = (ConnectivityManager) MyApplication.getInstance().getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();
        return (info != null && info.isConnected());
    }

}
