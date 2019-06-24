package com.geekH.IO_20190619;

import java.io.File;

/**
 * ͳ���ļ���С
 * 	1. �����������С��·��
 * 	2. ���幹����
 * 	3. ����ͳ�Ʒ�����ͳ���ļ���С
 * 		- �жϸ�Ŀ¼�Ƿ�Ϊ��
 * 		- ��Ϊ�յĻ����ж��Ƿ�Ϊ�ļ�
 * 		- ���ļ���ͳ���ļ���С
 * 		- �����ļ�����Ŀ¼�����г����¼��ļ����ݹ����ͳ�Ʒ���
 * @author geekH
 *
 */

public class TestCountFiles01 {
	private long len; // ��С
	private String path; // ·��
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












