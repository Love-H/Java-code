package day04.demo;

public class Demo05MethodParam {
	public static void main(String[] args) {
		System.out.println(methodThree(10,20,30));
		System.out.println(methodOne(50));
		System.out.println(methodNone());
	}
		//参数有多个
		public static int methodThree(int a,int b,int c) {
			int result = a + b + c;
			return result;
		}	
		//参数只有一个
		public static int methodOne(int num) {
			int result = num;
			return result;
		}
		//没有参数
		public static int methodNone() {
			int bee = 10000;
			return bee;
		}
}	

