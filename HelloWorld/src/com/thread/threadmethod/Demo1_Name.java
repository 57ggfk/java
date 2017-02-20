package com.thread.threadmethod;

/**
 * 线程名
 * Created by wangji on 2017/2/20.
 */
public class Demo1_Name {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName()+": --aaaa--");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName()+": --bbbb--");
            }
        }.start();

        new Thread("线程C") {
            @Override
            public void run() {
                System.out.println(this.getName()+": --通过构造方法给线程命名--");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                this.setName("线程d");
                System.out.println(this.getName()+": 通过set方法给线程命名");
            }
        }.start();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName()+": 通过Thread对象的setName方法");
            }
        };
        t1.setName("线程e");
        t1.start();
    }
}
