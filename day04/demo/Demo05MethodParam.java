package day04.demo;

public class Demo05MethodParam {
	public static void main(String[] args) {
		System.out.println(methodThree(10,20,30));
		System.out.println(methodOne(50));
		System.out.println(methodNone());
	}
		//�����ж��
		public static int methodThree(int a,int b,int c) {
			int result = a + b + c;
			return result;
		}	
		//����ֻ��һ��
		public static int methodOne(int num) {
			int result = num;
			return result;
		}
		//û�в���
		public static int methodNone() {
			int bee = 10000;
			return bee;
		}
}	

