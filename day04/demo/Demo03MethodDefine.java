package day04.demo;

public class Demo03MethodDefine {
	public static void main(String[] args) {
		//��������
		sum(10,20);
		System.out.println("=============");
		
		//��ӡ����
		System.out.println(sum(100,200));
		
		//��ֵ����
		int num = sum(15,23);
		System.out.println(num);
	}
		

		
	
	public static int sum(int a,int b) {
		System.out.println("��͵ķ���ִ������");
		int result = a+b;
		return result;
	}
}
