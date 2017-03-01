package com.test.operator;

/**
 * 三元运算符，嵌套使用
 * Created by wangji on 2017/3/1.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //simple();

        int a = 59;
        String s = score2grade(a);
        System.out.println(s);
    }

    /**
     * 三元运算符嵌套使用，可以不加括号
     * @param a 分数
     * @return  等级
     */
    private static String score2grade(int a) {
        String b = a > 0 && a < 60? "不及格":a >= 60 && a < 100?"及格":a == 100 ? "满分":"错误";
        return b;
    }

    /**
     * 三元运算符嵌套使用，加括号阅读更清晰
     * @param a 分数
     * @return  等级
     */
    private static String score2gradeParentheses(int a) {
        String b = a > 0 && a < 60? "不及格":(a >= 60 && a < 100?"及格":(a == 100 ? "满分":"错误"));
        return b;
    }

    /**
     * if方法实现
     * @param a 分数
     * @return  等级
     */
    private static String score2gradeIf(int a) {
        String b = "";
        if (a > 0 && a < 60) {
            b = "不及格";
        } else if (a >= 60 && a < 100) {
            b = "及格";
        } else if (a == 100) {
            b = "满分";
        } else {
            b = "错误";
        }

        return b;
    }

    private static void simple() {
        int a = 30;
        int b = a > 20?300:100;
        System.out.println(b);
    }

}
