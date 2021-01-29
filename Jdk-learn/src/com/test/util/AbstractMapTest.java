package com.test.util;

import org.omg.CORBA.OBJECT_NOT_EXIST;

import java.util.*;

public class AbstractMapTest {
    public static void main(String[] args) {
        abstractMap();
    }

    /**
     * abstractMap：
     * 实现为 Set数组 (Set<Entry<K,V>>)
     *
     */
    public static void abstractMap(){
        AbstractMap<String,Object> temp = new HashMap<>();
        //put方法 继承于 Map
        temp.put("test1","test2");
        temp.put("test2","test3");
        temp.put("test3","test4");
        //containsKey 实现方式为 Iterator 迭代器遍历 在遍历前 判断传入是否为null
        //containValue  也是一样的实现方式
        System.out.println(temp.containsKey("test1"));
        //get 实现方式 Iterator 每次在传入的数据 都做了null的判断
        System.out.println(temp.get("test1"));

        //删除方法 通过Iterator 循环查找这个key的
        System.out.println(temp.remove("test1"));
        System.out.println(temp.toString());
    }

    /**
     * abstractMap中的simpleImmutableEntry
     */
    public static void simpleImmutableEntry(){
        AbstractMap.SimpleEntry<String,Object> temp = new AbstractMap.SimpleEntry("test1","test21");
        System.out.println(temp.getKey()+"::::::::::::::::::"+temp.getValue());
        AbstractMap<String,String> map = new HashMap<>();
        map.put("test1","test12");
        for(Map.Entry entry:map.entrySet()){
            AbstractMap.SimpleImmutableEntry item = new AbstractMap.SimpleImmutableEntry(entry);
            System.out.println(item.getKey());
        }
    }
}
