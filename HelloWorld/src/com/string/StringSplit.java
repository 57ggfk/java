package com.string;

import java.util.Arrays;

/**
 * Created by wangji on 2017/4/14.
 */
public class StringSplit {

    public static void main(String[] args) {
        String str01 = "a,b,,c";
        String str02 = "a,b, ,c";
        String str03 = "a,b,c,";
        String str04 = "a,b,c, ";

        System.out.println("str01拆分数组长度：" + str01.split(",").length +
            str01.split(",")[3]);

        System.out.println("str02拆分数组长度：" + str02.split(",").length +
                "" + Arrays.toString(str02.split(str02)));
    }



}
