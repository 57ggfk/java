package com.thread;

/**
 * 匿名内部类实现多线程
 * Created by wangji on 2017/2/20.
 */
public class Demo4_Thread {
    public static void main(String[] args) {
        new Thread() {                                      //1,继承Thread类
            @Override
            public void run() {                             //2,重写run方法
                for (int i = 0; i < 10000; i++) {           //3,要执行的代码写在run方法中
                    System.out.println("aaaa----aaaa");
                }
            }
        }.start();                                          //4,开启线程

        new Thread(new Runnable() {                         //1,实现Runnable接口，将Runnable的子类对象传递给Thread的构造方法
            @Override
            public void run() {                             //2,重写run方法
                for (int i = 0; i < 10000; i++) {           //3,要执行的代码写在run方法中
                    System.out.println("----bbbb----");
                }
            }
        }).start();                                         //4,开启线程
    }
}
