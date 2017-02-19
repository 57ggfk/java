package com.test;

import java.io.PrintStream;

/**
 * Created by wangji on 2017/2/10.
 */
public class hello {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        method1(a,b);

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    private static void method1(int i, int j) {
        PrintStream printStream = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                super.println((""+x).replace(""+x,""+x+"0"));
            }
        };
        System.setOut(printStream);
    }

}
