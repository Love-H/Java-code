package day15.demo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo04FileWirter {
	public static void main(String[] args) throws IOException {
		FileWriter KK = new FileWriter("kk.txt");	
			
			KK.write("I\r\n");
			KK.write("Love\r\n");
			KK.write("You");
			
			KK.close();
				
	}
}
