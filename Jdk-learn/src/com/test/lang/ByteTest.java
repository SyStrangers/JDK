package com.test.lang;

public class ByteTest {
    public static void main(String[] args) {
        byte temp = '1';
        //继承与 Number 实现了 Comparable 排序接口
        Byte tempB = Byte.valueOf(temp);
        System.out.println(temp);
        System.out.println(tempB);
    }
}
