package com.test.lang;

public class BooleanTest {

    public static void main(String[] args) {
        //运用了静态工厂方法
        //hashcode 只有两个值 1231 1237 一个为真 一个为假
        Boolean test = new Boolean(Boolean.TRUE);
    }
}
