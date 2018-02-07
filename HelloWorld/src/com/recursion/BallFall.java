package com.recursion;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * Created by wangji on 2018/2/7.
 */
public class BallFall {

    public static void main(String[] args) {
        double trail = 100; // 经过的米数
        int count = 12; // 反弹次数
        double height = 100;

        for (int i = 1; i <= count; i++) {
            height /= 2;
            trail += height;
            if (i==9) {
                System.out.println("第9次反弹高度：" + height + "米");
            }
            if (i==12) {
                System.out.println("第12次落地时，共经过：" + trail + "米");
            }
        }

    }

}

