package com.geekh;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
  * 编写可视化日历
 * @author geekH3334
 *
 */

public class TestCalendar1 {
	public static void main(String[] args) throws ParseException {
		System.out.println("时间输入格式：2019-01-01");
		Scanner scanner = new Scanner(System.in);
		String dateString = scanner.nextLine();
		System.out.println("您刚刚输入的日期是: "+dateString);
		
		//将输入的字符串转化为日期对象
//		GregorianCalendar dateCalendar = new GregorianCalendar("yyyy-MM-DD"); // 易漏 yyyy-MM-DD
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(dateString);
		Calendar dateCalendar = new GregorianCalendar();
		int year = dateCalendar.get(Calendar.YEAR);
		int month = dateCalendar.get(Calendar.MONTH);
		int day = dateCalendar.get(Calendar.DAY_OF_MONTH);
		
		dateCalendar.set(Calendar.DATE, 1);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		System.out.print("\t");
		int maxDate = dateCalendar.getActualMaximum(Calendar.DATE);
		for (int i = 0; i < maxDate; i++) {
			System.out.print(i+1 + "\t");
			

		}
		

	}
}









