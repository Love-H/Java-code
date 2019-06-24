package com.geekH.IO_20190619;

import java.io.File;

/**
 * 统计文件大小
 * 	1. 定义变量，大小、路径
 * 	2. 定义构造器
 * 	3. 定义统计方法，统计文件大小
 * 		- 判断该目录是否为空
 * 		- 不为空的化，判断是否为文件
 * 		- 是文件，统计文件大小
 * 		- 不是文件，即目录，则列出其下级文件，递归调用统计方法
 * @author geekH
 *
 */

public class TestCountFiles {
	private long len; //大小 【需为 long 型】
	private String path; //文件夹路径
	private File src;
	
	public TestCountFiles(String path) {
		this.path = path;
		this.src = new File(path);
		countFiles(this.src);	//易漏
	}
	
	public void countFiles(File src) {
//		if (null==src || !src.exists()) {
		if (null!=src && src.exists()) {
			if(src.isFile()) {
				len += src.length();
//		}else if (src.isDirectory()) {
			}else {
//				File[] file = src.listFiles();
//				for (File f:file) {
				for (File s:src.listFiles())
					countFiles(s);
			}
		}	
	}
	
	public long getLen() {
		return len;
	}

	public static void main(String[] args) {
		TestCountFiles tcf = 
				new TestCountFiles("D:/Java/eclipse-workspace/Java_IO");
		System.out.println(tcf.getLen());
	}
}












