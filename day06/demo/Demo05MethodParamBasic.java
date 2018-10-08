package day06.demo;

public class Demo05MethodParamBasic {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("=========");
		
		change(a,b);
		System.out.println("=========");
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
	}
	
	public static void change(int x,int y) {
		x *= 10;
		y *= 10;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
