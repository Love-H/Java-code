package day06.demo;
//�޷���ֵ�ķ��� 

import java.util.Scanner;
public class Demo01MethodVoid {
	
	public static void main(String[] args) {		
		//��������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������Ҫѭ��������");
		int a = sc.nextInt();
		printlnCount(a);
		System.out.println("=========================");
		printlnHelloWorld();
	}
	
	public static void printlnHelloWorld() {
		for(int i = 1;i < 10;i++) {
		System.out.println("Hello,World "+i);
		}
	}
	
	public static void printlnCount(int count) {
		for(int i = 1;i <= count;i++) {
			System.out.println("Hello,World "+i);
			
		}
		return;				//��ʡ��	
	}
}
