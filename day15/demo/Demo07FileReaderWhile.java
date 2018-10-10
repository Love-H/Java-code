package day15.demo;

import java.io.FileReader;
import java.io.IOException;

public class Demo07FileReaderWhile {
	public static void main(String[] args) throws IOException {
		FileReader one = new FileReader("one.txt");	
		
		int ch;
		while((ch=one.read()) != -1) {
			
          //System.out.println(ch);
			
			System.out.println((char)ch);
		}
		
		one.close();
	}
}
