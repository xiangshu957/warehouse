package com.xxx.warehouse.utils;

/**
 * @Author: ZhangRuixiang
 * Date: 2021/4/13
 * DES:
 */
public class TextUtils {

    public static boolean isEmpty(String str){

        if (str == null){
            return true;
        }
        if (str.trim().equals("")){
            return true;
        }else if (str.trim().length() == 0){
            return true;
        }
        return false;
    }

}
