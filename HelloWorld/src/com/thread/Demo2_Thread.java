package com.thread;

/**
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

