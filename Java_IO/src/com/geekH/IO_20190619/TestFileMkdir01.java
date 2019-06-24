package com.geekH.IO_20190619;

import java.io.File;

/**
 * ͨ���ݹ飬��ӡ����Ŀ¼���ļ�������
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
		//����ǰ����
		for (int i=0; i<deep; i++) {
			System.out.print("-");
		}
		//��ӡ����
		System.out.println(src.getName());	//�׺��Կ��øú�����ȡ��ǰ�ļ���
//		if (null || src.exists()) {
		if (null==src || !src.exists()) {
			return;
//		} else {	//�׺����ж���������Ŀ¼��ʱ����ظ���ȡ��һ���ļ�
		} else if(src.isDirectory()) {	
			File[] subNames = src.listFiles();
			for (File s:subNames) {
				printName(s,deep+1);
			}
			
		}
		
	}
	
}









