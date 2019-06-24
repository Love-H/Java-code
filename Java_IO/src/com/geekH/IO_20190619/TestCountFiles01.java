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

public class TestCountFiles01 {
	private long len; // 大小
	private String path; // 路径
	private File src;
	private int fileSize;
	private int filesSize;
	
	public TestCountFiles01(String path) {
		this.path = path;
		this.src = new File(path);
		
		countFiles01(src);
	}
	
	public void countFiles01(File src) {
		
/*		if (null == src || !src.exists()) {
			return ;
		} else if (src.isFile()) {
			len += src.length();
		} else {
			for (File s:src.listFiles()) {
				countFiles01(s);
			}
		}
*/		
		
		if (null != src && src.exists()) {
			if (src.isFile()) {
				len += src.length();
				this.fileSize++;
			} else {
				for (File s:src.listFiles()) {
					countFiles01(s);
					this.filesSize++;
				}
			}
		}
		
	}
	
	public long getLen() {
		return len;
	}
	public int getFilesSize() {
		return filesSize;
	}
	public int getFileSize() {
		return fileSize;
	}
	
	public static void main(String[] args) {
		TestCountFiles01 tcf01 = 
				new TestCountFiles01("D:/Java/eclipse-workspace/Java_IO");
		System.out.println("Len: "+tcf01.getLen());
		System.out.println("FileSize: "+ tcf01.getFileSize());
		System.out.println("FilesSize: "+tcf01.getFilesSize());
	}
	
}












