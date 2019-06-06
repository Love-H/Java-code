package com.geekh;

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		testCalendar();
		
	}
	
	public static void testCalendar() {
		// �õ��������Ԫ��
		GregorianCalendar calendar = new GregorianCalendar(2019, 6, 2, 16, 01, 50);
		int year = calendar.get(Calendar.YEAR); // ��ӡ��2019
		int month = calendar.get(Calendar.MONTH); // ��ӡ��6
		// �գ�Calendar.DATE �� Calendar.DAT_OF_MONTH ͬ��
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day1 = calendar.get(Calendar.DATE);
		// �ܼ� �����ǣ�1-7.������1����һ��2��������������7
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day1);
		System.out.println(week);
		
		// ��������
		GregorianCalendar calendar1 = new GregorianCalendar();
		calendar1.set(Calendar.YEAR, 2019);
//		calendar1.set(Calendar.MONTH, 6); �״�����ֱ������6
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
        int date = calendar.get(Calendar.DAY_OF_WEEK) - 1; // ���ڼ�
        String week = "" + ((date == 0) ? "��" : date);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.printf("%d��%d��%d��,����%s %d:%d:%d\n", year, month, day,  
                        week, hour, minute, second);
	}
}
