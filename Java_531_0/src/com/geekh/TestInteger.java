package com.geekh;

/**
 * 测试包装类的用途
 * @author geekH3334
 *
 */

public class TestInteger {
	
    public static void main(String[] args) {
        TestInteger geekh = new TestInteger();
        geekh.TestIntegerInteger();
    }
	
    void TestIntegerInteger() {
        // 基本类型转化成Integer对象
        Integer int1 = new Integer(10);
        Integer int2 = Integer.valueOf(20); // 官方推荐这种写法
        // Integer对象转化成int
        int a = int1.intValue();
        // 字符串转化成Integer对象
        Integer int3 = Integer.parseInt("334");
        Integer int4 = new Integer("999");
        // Integer对象转化成字符串
        String str1 = int3.toString();
        // 一些常见int类型相关的常量
        System.out.println("int能表示的最大整数：" + Integer.MAX_VALUE); 
    }

}
