package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 面试题，看代码分析输出结果
 * (1)处如果不注释掉，能否输出结果，结果是什么？
 * list1=100
 * list2=0
 * list3=100
 * Created by wangji on 2017/2/22.
 */
public class ThreadTest extends Thread {
    private CountDownLatch countDownLatch;
    private ThreadLocal<List<Integer>> param = new ThreadLocal<>();
    public static List<Integer> list1 = new ArrayList<>();
    public static List<Integer> list2 = new ArrayList<>();
    public static List<Integer> list3 = new Vector<>();

    public ThreadTest(String name,CountDownLatch countDownLatch) {
        super();
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            //this.list1.add(i); //(1)
            this.list3.add(i);
        }
        this.param.set(list);
        countDownLatch.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        List<ThreadTest> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ThreadTest temp = new ThreadTest(String.valueOf(i),countDownLatch);
            threadList.add(temp);
            temp.start();
        }

        countDownLatch.await();
        for (ThreadTest temp : threadList) {
            if (temp.param.get()!=null) {
                ThreadTest.list2.addAll(temp.param.get());
            }
        }
        //System.out.println("list1="+list1.size()); //(1)
        System.out.println("list2="+list2.size());
        System.out.println("list3="+list3.size());
    }

}
