package day15.demo;

import java.io.FileReader;
import java.io.IOException;

public class Demo06FileReader {
	public static void main(String[] args) throws IOException {
		FileReader one = new FileReader("one.txt");
		
		int ch = one.read();
/*		System.out.println(one.read());
		
		ch = one.read();
		System.out.println(one.read());
*/		
		System.out.println(ch);
		
		ch = one.read();
		System.out.println(ch);
		
		one.close();
		
	}
}
