package day15.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo09FileReadArrayWhile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file08.txt");
		
		char[] buf = new char[2];
		int len;
		
		while ((len = fr.read(buf)) != -1) {
			String str = new String(buf,0,len);
			System.out.println(str);
		}
	}
}
