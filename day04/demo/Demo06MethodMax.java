package day04.demo;

import java.util.Scanner;
/*
 * ������������int�������ݣ�����һ��������������е����ֵ
*/
public class Demo06MethodMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //����
				
		System.out.println("�������һ�����֣�");
		int a = sc.nextInt();
		System.out.println("������ڶ������֣�");
		int b = sc.nextInt();
		
		int max = getMax(a,b);
		System.out.println("���ֵ��"+max); 
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
