package com.geekH;

import java.util.Arrays;

/***
 * ���� java.util.Arrays�������ʹ��
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
		// ��ӡ����
		System.out.println(a); // ��ӡ�������õ�ֵ
		System.out.println(Arrays.toString(a)); // ��ӡ����Ԫ�ص�ֵ		
	}
	
	public static void printArray1(int[] a) {
		// ��ӡ����������
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); // ����Ԫ�ص�����
		System.out.println(Arrays.toString(a));
	}
	
	public static void printArray2(int[] a) {
		// ���������е�ĳһԪ��
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); // ʹ�ö��ֲ��ҷ�,�����ȶ������������
		System.out.println(Arrays.toString(a));
		System.out.println("��Ԫ�ص�������" + Arrays.binarySearch(a, 11));
	}
	
	public static void printArray3(int[] a) {
		// �滻�����е�Ԫ��
		System.out.println(Arrays.toString(a));
		
		Arrays.fill(a, 2, 4, 100);
		System.out.println(Arrays.toString(a));
	}
	
	
	
}
