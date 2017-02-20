package com.thread;

/**
 * 2.实现Runnable

 - 定义类实现Runnable接口
 - 实现run方法
 - 把新线程要做的事写在run方法中
 - 创建自定义的Runnable的子类对象
 - 创建Thread对象, 传入Runnable
 - 调用start()开启新线程, 内部会自动调用Runnable的run()方法

 * Created by wangji on 2017/2/20.
 */
public class Demo3_Thread {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        //Runnable target = mr; //父类引用指向子类对象
        new Thread(mr).start(); //开启线程

        for (int i = 0; i < 10000; i++) {
            System.out.println("-------bb---------");
        }
    }
}

class MyRunnable implements Runnable {      // 1.创建子类实现Runnable接口

    @Override                               // 2.重写run方法
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("aaaa----aaaa"); // 3.要执行的代码，写在run方法内
        }
    }

}