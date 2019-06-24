package com.geekH.IO_20190619;

import java.io.File;

/**
 * 复习：通过递归，打印子孙文件
 * @author geekH
 *
 */

public class ReviewFileMkdir01 {
	public static void main(String[] args) {
		int deep = 0;
		File src = new File("D:/Java/eclipse-workspace/Java_IO");
		printFileNames01(src, deep);
	}
	
	public static void printFileNames01(File src, int deep) {
		//让文件更有层次感
		for (int i=0; i<deep; i++) {
			System.out.print("-");
		}
		
		//打印子孙文件
//		System.out.println(src.getAbsolutePath());	//不用输出绝对路径，只需获得文件名即可
		System.out.println(src.getName());
		
		if (null==src || !src.exists()) {
			return ;
		} else if (src.isDirectory()) {
			File[] subFileNames = src.listFiles();
			for (File s:subFileNames) {
				printFileNames01(s, deep+1);
			}
		}
	}
}













