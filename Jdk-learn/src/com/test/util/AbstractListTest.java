package com.test.util;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class AbstractListTest {

    public static void main(String[] args) {
//        AbstractList  继承这个类
        //ArrayList 有个限制 数组长度不能超过 2的31次方-1
//        ArrayList temp = new ArrayList(2147483639);

        Map<String,Integer> test = new HashMap<String,Integer>();
        test.put("test1",12);
        System.out.println(test);
        test(test);

    }

    public static void test(Map<String, Integer> map){
        map.put("test1",13);
    }
}
