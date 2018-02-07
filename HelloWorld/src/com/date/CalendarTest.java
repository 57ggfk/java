package com.date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by wangji on 2017/9/20.
 */
public class CalendarTest {
    public static void main(String[] args) {

        long mm = 1505810063000L;
        Date now = new Date(mm);
        System.out.println(now);
        System.out.println("当前时间毫秒值：" + System.currentTimeMillis());
        // 无夏令时的写法
        Date date = new Date(mm - TimeZone.getDefault().getRawOffset());
        System.out.println(date);

        // 有夏令时的写法
        Date date1 = new Date(mm - TimeZone.getDefault().getOffset(0));
        System.out.println(date1);
    }
}
