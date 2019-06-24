package com.geekH.IO_20190619;

import java.io.File;

/**
 * 1. ����Ŀ¼��
 * 	mkdirs(δ�и�Ŀ¼ʱ���Զ�����)
 * 	mkdir(�����Զ�����)
 * 2. �г���һ����
 * 	listFiles():�г��¼�File���� //��˼���������������·�� �磺D:\Java\eclipse-workspace\Java_IO\src
 * 	list():�г��¼����� //����src
 * 	lsitRoots:�г������̷�
 * @author geekH
 *
 */

public class TestFileMkdir {
	public static void main(String[] args) {
//		TestMkdir();
		TestList();
	}
	
	public static void TestMkdir() {
		// ����Ŀ¼
		File dir = new File("D:/Java/eclipse-workspace/Java_IO/dir/test");
		boolean flag = dir.mkdir();
		System.out.println(flag);
		
		flag = dir.mkdirs();
		System.out.println(flag);
		
		File dir01 = new File("D:/Java/eclipse-workspace/Java_IO/dir/test2");
		flag= dir01.mkdir();
		System.out.println(flag);
	}
	
	public static void TestList() {
		File dir = new File("D:/Java/eclipse-workspace/Java_IO");
		
		//�г��¼�����
		String[] subNames = dir.list();
		for(String s:subNames) {
			System.out.println(s);
		}
		
		//�¼�����
		File[] subFiles = dir.listFiles();
		for(File s:subFiles) {
			System.out.println(s.getAbsolutePath());
		}
		
		//�����̷�
		File[] roots = dir.listRoots();
		for(File r:roots) {
			System.out.println(r.getAbsolutePath());
		}
	}
}



























