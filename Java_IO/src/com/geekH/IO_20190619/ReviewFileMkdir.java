package com.geekH.IO_20190619;

import java.io.File;

/**
 * ��ϰ�����ļ����г���һ���������̷�
 * @author geekH
 *
 */

public class ReviewFileMkdir {
	public static void main(String[] args) {
//		TestMkdir();
		TestList();
	}
	
	public static void TestMkdir() {
		File src = new File("D:/Java/eclipse-workspace/Java_IO/dir/test");
		boolean flag = src.mkdirs();
		System.out.println(flag);
		
		flag = src.mkdir();
		System.out.println(flag);
		
		src = new File("D:/Java/eclipse-workspace/Java_IO/dir/test01");
		flag = src.mkdir();
		System.out.println(flag);
	}
	
	public static void TestList() {
		//�г��¼��ļ�����
		File src = new File("D:/Java/eclipse-workspace/Java_IO");
//		System.out.println(src.list()); //��ֱ�Ӵ�ӡ������[Ljava.lang.String;@15db9742
//		File dir = src.list();	//Waring! ����ΪString[]
		String[] subName = src.list();
		for (String s:subName) {
			System.out.println(s);
		}
		
		//�г��¼�File����
		File[] file = src.listFiles();
		for (File f:file) {
			System.out.println(f);
		}
		
		//�г������̷�
		File[] roots = src.listRoots();
		for (File r:roots) {
			System.out.println(r);
		}
		
	}
}



























