package day10.demo01;

public class Demo07Splite {
	public static void main(String[] args) {
		String str1 = "aaa,bbb,ccc";
		//����Ҫ�ָ�ı�ʶ��
		String[] array = str1.split(",");
		
		System.out.println("����ĳ����ǣ�" + array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);			
		}
	}
}
