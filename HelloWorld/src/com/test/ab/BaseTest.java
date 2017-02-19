package com.test.ab;

/**
 * Created by wangji on 2017/2/16.
 */
public class BaseTest extends Object implements Runnable {
    @Override
    public void run() {
        System.out.println("baseTest run");
    }
}
