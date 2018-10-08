package day10.demo01;

public class Demo07Splite {
	public static void main(String[] args) {
		String str1 = "aaa,bbb,ccc";
		//输入要分割的标识符
		String[] array = str1.split(",");
		
		System.out.println("数组的长度是：" + array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);			
		}
	}
}
