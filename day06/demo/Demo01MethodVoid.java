package day06.demo;
//无返回值的方法 

import java.util.Scanner;
public class Demo01MethodVoid {
	
	public static void main(String[] args) {		
		//键盘输入
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要循环次数：");
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
		return;				//可省略	
	}
}
