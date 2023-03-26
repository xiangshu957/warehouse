package com.xxx.warehouse.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Author: ZhangRuixiang
 * Date: 2020/12/24
 * DES: 验证工具类
 */
public class VerifyUtils {

    /**
     * 验证字符串是否为空或者为null
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim()) || str.length() == 0 || "null".equals(str.trim());
    }

    public static String getDateToString(long time) {
        Date d = new Date(time);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sf.format(d);
    }

    public static String getDateToStringMD(long time) {
        Date date = new Date(time);
        SimpleDateFormat sf = new SimpleDateFormat("MM月dd日 HH:mm");
        sf.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
        return sf.format(date);
    }

    public static String getDateToStringYMD(long time){
        Date date = new Date(time);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        return sf.format(date);
    }


}
