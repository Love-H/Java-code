package day04.demo;

import java.util.Scanner;
/*
 * 键盘输入两个int类型数据，定义一个方法，求出其中的最大值
*/
public class Demo06MethodMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //创建
				
		System.out.println("请输入第一个数字：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数字：");
		int b = sc.nextInt();
		
		int max = getMax(a,b);
		System.out.println("最大值："+max); 
	}
	
	public static int getMax(int x,int y) {
		if(x > y) {
			return x;
		}
		else {
			return y;
		}
	}

}
