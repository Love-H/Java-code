package day15.demo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("LH.txt");
		
		//����write����
		fw.write("I Love You!");
		fw.close();
	}
}
