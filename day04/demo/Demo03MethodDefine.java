package day04.demo;

public class Demo03MethodDefine {
	public static void main(String[] args) {
		//单独调用
		sum(10,20);
		System.out.println("=============");
		
		//打印调用
		System.out.println(sum(100,200));
		
		//赋值调用
		int num = sum(15,23);
		System.out.println(num);
	}
		

		
	
	public static int sum(int a,int b) {
		System.out.println("求和的方法执行啦！");
		int result = a+b;
		return result;
	}
}
