package day15.demo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo05FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter ii = new FileWriter("ii.txt");
		
		String str = "生前何必久睡，死后自会长眠";
		ii.write(str,1,6);
		
		char[] array = {'2','3','5','8','1','6'};
		ii.write(array,1,4);
		
		String str1 = "Head First Java";
		ii.write(str1, 1, 4);
		
		ii.close();
	}
}
