package com.geekH.IO_20190619;

import java.io.File;

/**
 * 通过递归，打印子孙目录和文件的名称
 * @author geekH
 *
 */

public class TestFileMkdir01 {
	public static void main(String[] args) {
		int deep = 0;
		File src = new File("D:/Java/eclipse-workspace/Java_IO");
		printName(src, deep);
	}
	
	public static void printName(File src, int deep) {
		//控制前面层次
		for (int i=0; i<deep; i++) {
			System.out.print("-");
		}
		//打印名称
		System.out.println(src.getName());	//易忽略可用该函数获取当前文件名
//		if (null || src.exists()) {
		if (null==src || !src.exists()) {
			return;
//		} else {	//易忽略判断条件：是目录的时候才重复读取下一级文件
		} else if(src.isDirectory()) {	
			File[] subNames = src.listFiles();
			for (File s:subNames) {
				printName(s,deep+1);
			}
			
		}
		
	}
	
}









