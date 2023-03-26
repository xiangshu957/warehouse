package com.xxx.warehouse.utils;

import android.content.Context;
import android.os.Environment;

import java.io.File;

/**
 * @Author: ZhangRuixiang
 * Date: 2020/12/27
 * DES:
 */
public class FileUtil {

    /**
     * 存储在sd卡上目录名字(默认)
     */
    public static String sdCardCacheDirName = "wmspda";

    /**
     * SD卡路径
     *
     * @return
     */
    public static String getSavePath(Context context) {

        File sdDir;

        boolean sdExist = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
        if (sdExist) {
            sdDir = Environment.getExternalStorageDirectory();
        } else {
            sdDir = context.getFilesDir();
        }

        return sdDir.getAbsolutePath() + File.separator;
    }

    public static String createFileName(String appName) {

        long currentTimeMillis = System.currentTimeMillis();

        return appName + "_" + currentTimeMillis;
    }

    public static boolean deleteFile(File file) {


        if (file.isFile()) {
            file.delete();
            return true;
        }

        if (file.isDirectory()) {
            File[] childFiles = file.listFiles();
            if (childFiles == null || childFiles.length == 0) {
                file.delete();
                return true;
            }

            for (int i = 0; i < childFiles.length; i++) {
                deleteFile(childFiles[i]);
            }
            file.delete();

        }
        if (file.exists()) {
            return false;
        } else {
            return true;
        }
    }

}
