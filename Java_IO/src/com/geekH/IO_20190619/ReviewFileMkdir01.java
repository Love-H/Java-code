package com.geekH.IO_20190619;

import java.io.File;

/**
 * ��ϰ��ͨ���ݹ飬��ӡ�����ļ�
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
		//���ļ����в�θ�
		for (int i=0; i<deep; i++) {
			System.out.print("-");
		}
		
		//��ӡ�����ļ�
//		System.out.println(src.getAbsolutePath());	//�����������·����ֻ�����ļ�������
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













