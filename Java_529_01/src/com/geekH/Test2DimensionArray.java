package com.geekH;

import java.util.Arrays;

public class Test2DimensionArray {
	
	public static void main(String[] args) {
		
//		Array1();
//		Array2();
		Array3();

	}
	
	public static void Array1() {
		// ��̬��ʼ��
		int[][] a = new int[3][];
//		a[0] = {1, 2, 3}; ����û���������;ͳ�ʼ��������
		
		a[0] = new int[] {1, 2, 3};
		a[1] = new int[] {12, 45, 99, 100, 236};
		// ������������к�����
		System.out.println(Arrays.toString(a)); 
		System.out.println(Arrays.toString(a[0]));
		
	}
	
	public static void Array2() {
		// ��̬��ʼ��
		int[][] a = {
				{1, 9, 11}, 
				{3, 42, 99}, 
				{4, 31, 21}, 
				};
		
		// Ϊ�� a[2]�������������a[2][1]ȴ���У�
		System.out.println(Arrays.toString(a[2]));
//		System.out.println(Arrays.toString(a[2][1]));
		
		System.out.println(a[2][1]);
		
	}
	
	public static void Array3() {
		// ��ȡ���鳤��
		int[][] a = {
				{1, 9, 11}, 
				{3, 42, 99, 53}, 
				{4, 31, 21, 67, 86}, 
				};
		
		System.out.println(a.length);
		System.out.println(a[1].length);
		
	}

	
}
