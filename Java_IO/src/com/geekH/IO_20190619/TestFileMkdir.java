package com.geekH.IO_20190619;

import java.io.File;

/**
 * 1. 创建目录：
 * 	mkdirs(未有该目录时，自动创建)
 * 	mkdir(不会自动创建)
 * 2. 列出下一级：
 * 	listFiles():列出下级File对象 //意思就是输出整个完整路径 如：D:\Java\eclipse-workspace\Java_IO\src
 * 	list():列出下级名称 //则是src
 * 	lsitRoots:列出所有盘符
 * @author geekH
 *
 */

public class TestFileMkdir {
	public static void main(String[] args) {
//		TestMkdir();
		TestList();
	}
	
	public static void TestMkdir() {
		// 创建目录
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
		
		//列出下级名称
		String[] subNames = dir.list();
		for(String s:subNames) {
			System.out.println(s);
		}
		
		//下级对象
		File[] subFiles = dir.listFiles();
		for(File s:subFiles) {
			System.out.println(s.getAbsolutePath());
		}
		
		//所有盘符
		File[] roots = dir.listRoots();
		for(File r:roots) {
			System.out.println(r.getAbsolutePath());
		}
	}
}



























