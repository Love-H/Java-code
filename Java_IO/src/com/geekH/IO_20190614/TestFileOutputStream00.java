package com.geekH.IO_20190614;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream00 {
	public static void main(String[] args) {
		String string = "Hello, geekH!";
		FileOutputStream fos = null;
		try {
//			FileOutputStream fos = new FileOutputStream("C:/Users/geekH/Desktop/a.txt");
			fos = new FileOutputStream("C:/Users/geekH/Desktop/a.txt",true);
			fos.write(string.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
