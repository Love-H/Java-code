package day08.demo;

import java.util.Arrays;

public class Demo01PrintArray {
	public static void main(String[] args) {
		int[] Array = {1,2,3,4,5};
		
		System.out.print("[");
		for (int i = 0; i < Array.length; i++) {
			if(i < Array.length-1) {
				System.out.print(Array[i] + ", ");
			}
			else {
				System.out.println(Array[i] + "]");
			}
		}
		
		System.out.println("==============");
		
		String str = Arrays.toString(Array);
		System.out.println(str);

		System.out.println("==============");

		System.out.println(Arrays.toString(Array));
	}
	
/*	public static int printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			
		}
	}*/
}
