package day04.demo;
/*
 * �����������ܲ��ܺͷ���������һ����                                                   ����
 * �������������������ÿһ���������ж���һ��ͬ���ı�����            ���ԣ���Ȼ����һ����������������    
*/
public class Demo04Names {
	public static void main(String[] args) {

		int result = 100;
		System.out.println("main���е�result:" + result);  //100
		System.out.println(sum(10,30));		//40
		
	}
	public static int sum(int a,int b) {
		int result = a + b;
		System.out.println("sum���е�result:" + result);  //40
		return result;
	}
}
