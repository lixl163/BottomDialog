package com.xiao.bottomdailog.util;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * Created by lixl on 2016/9/12.
 * 屏幕相关的工具类.
 */
public class ScreenUtil {

    /**
     *
     * @param activity
     * @return   Andorid.util 包下的DisplayMetrics 类提供了一种关于显示的通用信息，如显示大小，分辨率和字体。
     */
    public static DisplayMetrics getDisplayMetrics(Activity activity) {
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics;
    }

    /**
     *
     * @param activity
     * @return  屏幕宽
     */
    public static int getScreenWidth(Activity activity) {
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }

    /**
     *
     * @param activity
     * @return  屏幕高
     */
    public static int getScreenHeight(Activity activity) {
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    }

    /**
     * 获取系统状态栏的高度
     *
     * @param activity activity
     * @return 状态栏的高度
     */
    public static int getStatusBarHeight(Activity activity) {
        int statusBarHeight = DensityUtil.dp2px(activity, 25);
        int resourceId = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            statusBarHeight = activity.getResources().getDimensionPixelSize(resourceId);
        }
        return statusBarHeight;
    }
}
