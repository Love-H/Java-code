package com.geekh;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
  * ��д���ӻ�����
 * @author geekH3334
 *
 */

public class TestCalendar1 {
	public static void main(String[] args) throws ParseException {
		System.out.println("ʱ�������ʽ��2019-01-01");
		Scanner scanner = new Scanner(System.in);
		String dateString = scanner.nextLine();
		System.out.println("���ո������������: "+dateString);
		
		//��������ַ���ת��Ϊ���ڶ���
//		GregorianCalendar dateCalendar = new GregorianCalendar("yyyy-MM-DD"); // ��© yyyy-MM-DD
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dateFormat.parse(dateString);
		Calendar dateCalendar = new GregorianCalendar();
		int year = dateCalendar.get(Calendar.YEAR);
		int month = dateCalendar.get(Calendar.MONTH);
		int day = dateCalendar.get(Calendar.DAY_OF_MONTH);
		
		dateCalendar.set(Calendar.DATE, 1);
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		System.out.print("\t");
		int maxDate = dateCalendar.getActualMaximum(Calendar.DATE);
		for (int i = 0; i < maxDate; i++) {
			System.out.print(i+1 + "\t");
			

		}
		

	}
}









