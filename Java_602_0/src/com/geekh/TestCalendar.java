package com.geekh;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		testCalendar();
		
	}
	
	public static void testCalendar() {
		// 得到相关日期元素
		GregorianCalendar calendar = new GregorianCalendar(2019, 6, 2, 16, 01, 50);
		int year = calendar.get(Calendar.YEAR); // 打印：2019
		int month = calendar.get(Calendar.MONTH); // 打印：6
		// 日：Calendar.DATE 和 Calendar.DAT_OF_MONTH 同义
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day1 = calendar.get(Calendar.DATE);
		// 周几 这里是：1-7.周日是1，周一是2，。。。周六是7
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day1);
		System.out.println(week);
		
		// 设置日期
		GregorianCalendar calendar1 = new GregorianCalendar();
		calendar1.set(Calendar.YEAR, 2019);
//		calendar1.set(Calendar.MONTH, 6); 易错，不是直接输入6
		calendar1.set(Calendar.MONTH, Calendar.JANUARY);
		calendar1.set(Calendar.HOUR_OF_DAY, 16);
		calendar1.set(Calendar.MINUTE, 20);
		calendar1.set(Calendar.SECOND, 21);
		printCalendar(calendar1);
		
	}

	private static void printCalendar(GregorianCalendar calendar) {
		// TODO Auto-generated method stub
		int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int date = calendar.get(Calendar.DAY_OF_WEEK) - 1; // 星期几
        String week = "" + ((date == 0) ? "日" : date);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.printf("%d年%d月%d日,星期%s %d:%d:%d\n", year, month, day,  
                        week, hour, minute, second);
	}
}
