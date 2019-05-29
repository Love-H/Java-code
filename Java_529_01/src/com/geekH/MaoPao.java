package com.geekH;

import java.util.Arrays;

public class MaoPao {
	public static void main(String[] args) {
		int a[] = {154, 35, 18, 24, 11, 67, 99, 2};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) { //为何a.length-i不对？还得再减去1 
				if (a[j] > a[j+1]) {
					
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		
	}
}
