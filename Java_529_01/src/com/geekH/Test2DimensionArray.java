package com.geekH;

import java.util.Arrays;

public class Test2DimensionArray {
	
	public static void main(String[] args) {
		
//		Array1();
//		Array2();
		Array3();

	}
	
	public static void Array1() {
		// 动态初始化
		int[][] a = new int[3][];
//		a[0] = {1, 2, 3}; 错误！没有声明类型就初始化！！！
		
		a[0] = new int[] {1, 2, 3};
		a[1] = new int[] {12, 45, 99, 100, 236};
		// 下面两种输出有何区别？
		System.out.println(Arrays.toString(a)); 
		System.out.println(Arrays.toString(a[0]));
		
	}
	
	public static void Array2() {
		// 静态初始化
		int[][] a = {
				{1, 9, 11}, 
				{3, 42, 99}, 
				{4, 31, 21}, 
				};
		
		// 为何 a[2]就能正常输出，a[2][1]却不行？
		System.out.println(Arrays.toString(a[2]));
//		System.out.println(Arrays.toString(a[2][1]));
		
		System.out.println(a[2][1]);
		
	}
	
	public static void Array3() {
		// 获取数组长度
		int[][] a = {
				{1, 9, 11}, 
				{3, 42, 99, 53}, 
				{4, 31, 21, 67, 86}, 
				};
		
		System.out.println(a.length);
		System.out.println(a[1].length);
		
	}

	
}
