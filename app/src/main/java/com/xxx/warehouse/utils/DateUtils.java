package com.xxx.warehouse.utils;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author: ZhangRuixiang
 * Date: 2021/5/11
 * DES:
 */
public class DateUtils {

    public static String formatDate(String date) {

        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(date).toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


}
