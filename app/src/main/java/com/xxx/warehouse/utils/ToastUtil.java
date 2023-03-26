package com.xxx.warehouse.utils;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.xxx.warehouse.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: ZhangRuixiang
 * Date: 2020/12/22
 * DES:
 */
public class ToastUtil {

    private static com.xxx.warehouse.utils.ToastUtil toastUtil;

    private Toast toast;

    private ToastUtil() {
    }

    public static com.xxx.warehouse.utils.ToastUtil getInstance() {
        if (toastUtil == null) {
            synchronized (com.xxx.warehouse.utils.ToastUtil.class) {
                if (toastUtil == null) {
                    toastUtil = new com.xxx.warehouse.utils.ToastUtil();
                }
            }
        }

        return toastUtil;
    }

    /**
     * @param context 上下文
     * @param root    父布局
     * @param msg     内容
     */
    public void showToast(Context context, ViewGroup root, String msg) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_toast, root);
        TextView tvToast = (TextView) view.findViewById(R.id.tv_toast);
        tvToast.setText(msg);
        tvToast.setTextColor(Color.WHITE);
        toast = new Toast(context);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(500);
        toast.setView(view);
        toast.show();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override

            public void run() {

                toast.show();

            }
        //Toast  long默认显示的是3000毫秒，所以设置成3000
        }, 0, 3000);

        new Timer().schedule(new TimerTask() {

            @Override

            public void run() {

                toast.cancel();

                timer.cancel();

            }

        }, 1000);

    }
}
