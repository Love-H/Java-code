package day07.demo;
//整个数组扩大十倍
public class Demo02MethodParmRef {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println("==============");

		change(array);
		System.out.println("==============");
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
	
	public static void change(int a[]) {
		a[0] *= 10;
		a[1] *= 10;
		a[2] *= 10;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}
