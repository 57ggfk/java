package com.thread.threadmethod;

/**
 * Created by wangji on 2017/2/21.
 */
public class Demo2_CurrentThread {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println(getName()+": 继承Thread的getName");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+": 实现Runnab接口，获取当前线程再getName");
            }
        }).start();
        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName()+": 获取主线程的名字");

    }
}
