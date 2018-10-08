package day06.demo;

import java.util.Scanner;
public class Demo01MethodVoid {
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要循环次数：");
		int a = sc.nextInt();
		printlnHelloWorld();
		System.out.println("=========================");
		printlnCount(a);
	}
	
	public static void printlnHelloWorld() {
		for(int i = 1;i < 10;i++) {
		System.out.println("Hello,World"+i);
		}
	}
	
	public static void printlnCount(int count) {
		for(int i = 1;i <= count;i++) {
			System.out.println("Hello,World "+i);
			
		}
		return;		
	}
}
