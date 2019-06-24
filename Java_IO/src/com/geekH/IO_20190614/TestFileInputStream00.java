package com.geekH.IO_20190614;

import java.io.*;

public class TestFileInputStream00 {
	public static void main(String[] args) {
		try {
			// 创建输入流
			FileInputStream fis = new FileInputStream("C:/Users/geekH/Desktop/a.txt");
			// 一个字节一个字节的读取
			int s1 = fis.read();
			int s2 = fis.read();
			int s3 = fis.read();
			int s4 = fis.read();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}