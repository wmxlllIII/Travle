package com.zzy.travle.util;

public class TimeFormatter {

    private static final long MINUTE = 60;
    private static final long HOUR = 60 * MINUTE;
    private static final long DAY = 24 * HOUR;
    private static final long WEEK = 7 * DAY;
    private static final long MONTH = 30 * DAY;
    private static final long YEAR = 365 * DAY;

    /**
     *param->dataTime
     */
    public static String formatRelativeTimeText(long dataTime) {
        long now = System.currentTimeMillis() / 1000;
        long gap = now - dataTime;
        if (gap < 0) {
            return "刚刚";
        } else if (gap < MINUTE) {
            return "刚刚";
        } else if (gap < HOUR) {
            return gap / MINUTE + "分钟前";
        } else if (gap < DAY) {
            return gap / HOUR + "小时前";
        } else if (gap < WEEK) {
            return gap / DAY + "天前";
        } else if (gap < MONTH) {
            return gap / WEEK + "周前";
        } else if (gap < YEAR) {
            return gap / MONTH + "个月前";
        } else {
            return gap / YEAR + "年前";
        }
    }

}
