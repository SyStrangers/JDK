package com.test.lang;


public class ObjectTest {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        synchronized (obj){
            System.out.println("开始："+System.currentTimeMillis());
            obj.wait(1000L);
            System.out.println("结束："+System.currentTimeMillis());
            System.out.println("开始："+System.currentTimeMillis());
            obj.wait(1000L,100);
            System.out.println("结束："+System.currentTimeMillis());
            System.out.println("开始："+System.currentTimeMillis());
            obj.wait(1000L);
            System.out.println("结束："+System.currentTimeMillis());
            System.out.println(obj.toString());
        }


    }
}
