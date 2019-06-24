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

public class TestCountFiles {
	private long len; //��С ����Ϊ long �͡�
	private String path; //�ļ���·��
	private File src;
	
	public TestCountFiles(String path) {
		this.path = path;
		this.src = new File(path);
		countFiles(this.src);	//��©
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












