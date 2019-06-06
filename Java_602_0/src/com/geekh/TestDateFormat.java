package com.geekh;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException{
		testDateFormat();
	}
	
	public static void testDateFormat() throws ParseException {
		DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		DateFormat date2 = new SimpleDateFormat("yyyy-MM-dd");
		
		String daytime1 = date1.format(new Date());
		System.out.println(daytime1);
		String daytime2 = date2.format(new Date());
		System.out.println(daytime2);
		
		// ������ָ����ʽ���ַ���ת��Ϊʱ����󣬡��ַ�����ʽ��Ҫ��ָ����ʽһ�£���
		String time1 = "2017-06-02 15:26:31";
		Date date = date1.parse(time1);
		System.out.println(date);
		
		String time2 = "2017-06-02";
		Date dat = date2.parse(time2);
		System.out.println(dat);
		
		// ʱ���ʽ�ַ���ʹ��
		DateFormat date3 = new SimpleDateFormat("D");
		String time3 = date3.format(new Date());
		System.out.println(time3);
	}
}
