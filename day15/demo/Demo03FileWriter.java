package day15.demo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03FileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter HH = new FileWriter("JJ.txt",true);
		
		HH.write(" LOVE ");
		
		HH.close();
	}
}
