package com.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 通过递归实现字符组合
 * Created by wangji on 2017/2/23.
 */
public class ComboCharArray2StringArray {

    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        String[] doit = doit(chars, 2);
        //输出字符串
        StringBuffer sb = new StringBuffer("{");
        for (int i = 0; i < doit.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("\"" + doit[i] + "\"");
        }
        sb.append("}");
        System.out.println(sb.toString());
    }

    /**
     * 例如输入{'a','b','c','d'}和个数1，则返回{"a","b","c","d"}
     * 例如输入{'a','b','c'}和个数2，则返回{"aa","ab","ac","ba","bb","bc","ca","cb","cc"}
     * @param chars 字符数组，元素不能重复
     * @param n   组合成字符串数组的元素的字符个数
     * @return      返回这些字符组成的所有程度为n的字符串字符串数组
     */
    private static String[] doit(char[] chars, int n) {
        //创建一个List集合，用于生成数组
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < chars.length; i++) {

            if (n == 1) {
                //如果个数为1，就把字符转为字符串保存到新数组上
                list.add(String.valueOf(chars[i]));
            } else if (n > 1){
                //如果个数大于1，递归获得数组然后遍历并拼接字符串
                String[] doit = doit(chars, n - 1);
                for (int j = 0; j < doit.length; j++) {
                    list.add(String.valueOf(chars[i]) + doit[j]);
                }
            }

        }
        //创建一个空数组，用于把List集合中的数据转存到数组
        String[] strings = new String[list.size()];
        //生成数组返回
        return list.toArray(strings);
    }
}
