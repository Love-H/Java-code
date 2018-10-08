package day04.demo;
/*
 * 变量的名称能不能和方法的名称一样？                                                   可以
 * 如果有两个方法，可以每一个方法当中都有一个同名的变量吗？            可以，虽然名称一样，但是两个变量    
*/
public class Demo04Names {
	public static void main(String[] args) {

		int result = 100;
		System.out.println("main当中的result:" + result);  //100
		System.out.println(sum(10,30));		//40
		
	}
	public static int sum(int a,int b) {
		int result = a + b;
		System.out.println("sum当中的result:" + result);  //40
		return result;
	}
}
