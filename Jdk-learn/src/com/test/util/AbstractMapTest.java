package com.test.util;

import org.omg.CORBA.OBJECT_NOT_EXIST;
import sun.security.ec.point.ProjectivePoint;

import java.util.*;

public class AbstractMapTest {
    public static void main(String[] args) {
        simpleImmutableEntry();
    }

    /**
     * abstractMap：
     * 实现为 Set数组 (Set<Entry<K,V>>)
     *
     */
    public static void abstractMap(){
        AbstractMap<Object,Object> temp = new HashMap<>();
        //put方法 继承于 Map
        temp.put(temp,"test2");
//        temp.put("test2","test3");
//        temp.put("test3","test4");
        //containsKey 实现方式为 Iterator 迭代器遍历 在遍历前 判断传入是否为null
        //containValue  也是一样的实现方式
//        System.out.println(temp.containsKey("test1"));
//        //get 实现方式 Iterator 每次在传入的数据 都做了null的判断
//        System.out.println(temp.get("test1"));
//
//        //删除方法 通过Iterator 循环查找这个key的
//        System.out.println(temp.remove("test1"));
        System.out.println(temp.toString());
        System.out.println("_____________________");
        System.out.println(temp.values());

        System.out.println();
    }

    /**
     * abstractMap中的simpleImmutableEntry
     */
    public static void SimpleEntry(){
        AbstractMap.SimpleEntry<String,Object> temp = new AbstractMap.SimpleEntry("test1","test21");
        System.out.println(temp.getKey()+"::::::::::::::::::"+temp.getValue());
        AbstractMap<String,String> map = new HashMap<>();
        map.put("test1","test12");
        for(Map.Entry entry:map.entrySet()){
            AbstractMap.SimpleImmutableEntry item = new AbstractMap.SimpleImmutableEntry(entry);
            System.out.println(item.getKey());
        }
    }

    public static void simpleImmutableEntry(){
        AbstractMap.SimpleImmutableEntry<String,Object> temp = new AbstractMap.SimpleImmutableEntry<String, Object>("test1","test2");
//        temp.setValue(new String("test"));
        System.out.println(temp.equals("test1"));
        System.out.println(temp.hashCode());
        System.out.println(temp.toString());
        System.out.println(temp.getValue());
        System.out.println(temp.getKey());
    }
}
