package day15.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo08FileReaderArray {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file08.txt");
		
		char[] buf = new char[2];
		
		int len = fr.read(buf);
		System.out.println("len:" + len);
		String str = new String(buf,0,len);
		System.out.println("str=" + str);

		len = fr.read(buf);
		System.out.println("len:" + len);		
		str = new String(buf,0,len);
		System.out.println("str=" + str);
		
		len = fr.read(buf);
		System.out.println("len:" + len);
		str = new String(buf,0,len);
		System.out.println("str=" + str);
	}
}
