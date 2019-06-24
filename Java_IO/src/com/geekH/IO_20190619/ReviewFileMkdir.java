package com.geekH.IO_20190619;

import java.io.File;

/**
 * 复习创建文件、列出下一级、所有盘符
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
		//列出下级文件名称
		File src = new File("D:/Java/eclipse-workspace/Java_IO");
//		System.out.println(src.list()); //会直接打印包名！[Ljava.lang.String;@15db9742
//		File dir = src.list();	//Waring! 必须为String[]
		String[] subName = src.list();
		for (String s:subName) {
			System.out.println(s);
		}
		
		//列出下级File对象
		File[] file = src.listFiles();
		for (File f:file) {
			System.out.println(f);
		}
		
		//列出所有盘符
		File[] roots = src.listRoots();
		for (File r:roots) {
			System.out.println(r);
		}
		
	}
}



























