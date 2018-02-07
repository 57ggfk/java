package com.test.ab;

/**
 * 一个类继承父类实现接口，它的实例就是任何的实例
 * Created by wangji on 2017/2/16.
 */
public class AdvancedTest extends BaseTest {
    public static void main(String[] args) {
        Object obj = new AdvancedTest();
        System.out.println(checkTest(obj));

        BaseTest obj2 = new AdvancedTest();
        System.out.println(checkTest(obj2));

        Runnable run = (Runnable)obj2;
        System.out.println(checkTest(run));
        // 是谁的实例，看具体对象能够强转成谁
    }
    public static boolean checkTest(Object obj) {
        System.out.println("current class: " + obj.getClass().getName());
        if (obj instanceof BaseTest) {
            System.out.println("a BaseTest");
        } else {
            System.out.println("not a BaseTest");
        }

        if (obj instanceof Runnable) {
            System.out.println("a Runnable");
        } else {
            System.out.println("not a Runnable");
        }

        if (obj instanceof AdvancedTest) {
            System.out.println("a AdvancedTest");
        } else {
            System.out.println("not a AdvancedTest");
        }
        return true;
    }
}
