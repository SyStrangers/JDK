package com.test.string;

import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {
        //底层为 char数组 初始化的时候把内容放进char[] value 中
       String str = new String();
        // 实现方式为 直接输出char数组的length;
        str.length();
        // 判断当前字符串的长度是否为0 当前为空 返回 true
        // 为NULL 会报空指针异常
        str.isEmpty();
        //字符串比较  先比较 当前对象跟传入的是不是同一个对象
        str.equals("");

    }
}
