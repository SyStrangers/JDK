package com.test.util;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class AbstractListTest {

    public static void main(String[] args) {
//        AbstractList  继承这个类
        //ArrayList 有个限制 数组长度不能超过 2的31次方-1
        ArrayList temp = new ArrayList(2147483647);

    }
}
