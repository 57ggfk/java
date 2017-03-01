package com.thread.threadmethod;

/**
 * Created by wangji on 2017/2/21.
 */
public class Demo3_Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 20; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println("倒计时"+i+"秒");
        }
    }
}
