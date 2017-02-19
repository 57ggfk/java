package com.test;

import java.io.File;

/**
 * Created by wangji on 2017/2/10.
 */
public class Tagers {
    //父层目录
    private static String baseDirStr = "D:\\Java\\IdeaProjects\\e3mall";

    public static void main (String[] args) {

        //
        System.out.println("父层目录："+baseDirStr);

        //遍历目录
        File baseDir = new File(baseDirStr);
/*
        if (baseDir.exists()) {
            File[] files = baseDir.listFiles();

        }
        }
*/


    }
}
