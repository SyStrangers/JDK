package com.test.lang;

import java.util.HashMap;
import java.util.Map;

public class StringBufferTest {

    public static void main(String[] args) {

        //底层实现为char
        //默认的char数组长度为16
        // 继承于AbstractStringBuilder
        //每次append 都会加上当前字符串的长度
        StringBuffer stringBuffer = new StringBuffer();
        //初始化长度为 字符串+16
        StringBuffer str = new StringBuffer("test");
    }

}
