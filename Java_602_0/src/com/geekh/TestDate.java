package com.geekh;

import java.util.*;

public class TestDate {
	public static void main(String[] args) {

//		testLong();
		testDate();
	}

	public static void testLong() {
		// 时刻数值
		long now = System.currentTimeMillis();
		System.out.println(now);
	}

	public static void testDate() {
		// Date类的使用
		Date date0 = new Date();
		long i = date0.getTime();
		System.out.println(i);
		
		Date date1 = new Date(i+9999);
		Date date2 = new Date(i-9999);
		// 判断时间前后
		System.out.println(date1.before(date2));
		System.out.println(date1.after(date2));
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.toString());
		
	}
}
