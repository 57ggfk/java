package com.thread;

/**
 * 1.继承Thread

 - 定义类继承Thread
 - 重写run方法
 - 把新线程要做的事写在run方法中
 - 创建线程对象
 - 开启新线程, 内部会自动执行run方法

 * Created by wangji on 2017/2/20.
 */
public class Demo2_Thread {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("-------bb---------");
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("aaaaa------aaaaaaa");
        }
    }
}

