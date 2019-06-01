package com.geekH;

import java.util.Arrays;

/***
 * 测试 java.util.Arrays工具类的使用
 * 1. 打印 
 * 2. 排序
 * 3. 查找
 * 4. 替换
 * @author geekH3334
 *
 */

public class TestArrays {

	public static void main(String[] args) {
		int[] a = {1, 5, 16, 29, 2, 11, 27};
//		printArray(a);
//		printArray1(a);
//		printArray2(a);
		printArray3(a);
		
		
	}
	
	public static void printArray(int[] a) {
		// 打印数组
		System.out.println(a); // 打印数组引用的值
		System.out.println(Arrays.toString(a)); // 打印数组元素的值		
	}
	
	public static void printArray1(int[] a) {
		// 打印排序后的数组
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); // 数组元素的排序
		System.out.println(Arrays.toString(a));
	}
	
	public static void printArray2(int[] a) {
		// 查找数组中的某一元素
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); // 使用二分查找法,必须先对数组进行排序
		System.out.println(Arrays.toString(a));
		System.out.println("该元素的索引：" + Arrays.binarySearch(a, 11));
	}
	
	public static void printArray3(int[] a) {
		// 替换数组中的元素
		System.out.println(Arrays.toString(a));
		
		Arrays.fill(a, 2, 4, 100);
		System.out.println(Arrays.toString(a));
	}
	
	
	
}
