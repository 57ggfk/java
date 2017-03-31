package com.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by wangji on 2017/3/31.
 */
public class DecimalFormatDemo {
    public static void main(String[] args) {
        int i = 2317689;
        int j = 28987979;
        float k = 100* (float)i / (float)j;
        String format = new DecimalFormat("##0.##").format(k);
        System.err.println(format);
    }
}
