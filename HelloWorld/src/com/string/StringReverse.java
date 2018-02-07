package com.string;

import java.util.Arrays;

/**
 * Created by wangji on 2018/2/7.
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverse(str));

        System.out.println(bufferReverse(str));
    }

    public static String reverse(String origin) {
        char[] chars = origin.toCharArray();
        int len = chars.length;
        char[] _chars = new char[len];
        for (int i = len; i > 0; i--) {
            _chars[len - i] = chars[i - 1];
        }
        return String.valueOf(_chars);
    }

    public static String bufferReverse(String origin) {
        StringBuffer sb = new StringBuffer(origin);
        return sb.reverse().toString();
    }
}
