package com.test.ab;

/**
 * 一个类继承父类实现接口，它的实例就是任何的实例
 * Created by wangji on 2017/2/16.
 */
public class AdvancedTest extends BaseTest {
    public static void main(String[] args) {
        Object obj = new AdvancedTest();
        System.out.println(checkTest(new String("")));
    }
    public static boolean checkTest(Object obj) {
        if (obj instanceof BaseTest)
            //return true;
        System.out.println("not a BaseTest");
        if (obj instanceof Runnable)
            //return true;
        System.out.println("not Runnable");

        if (obj instanceof AdvancedTest)
            //return true;
        System.out.println("not AdvancedTest");
        return false;
    }
}
