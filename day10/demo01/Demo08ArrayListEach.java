package day10.demo01;

import java.util.ArrayList;

public class Demo08ArrayListEach {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//���
		list.add("LH");
		list.add("HJ");
		list.add("MM");
		
		System.out.println(list);
		
		//��������ÿһ���ַ�������
		//���ϵĳ��Ȼ�ȡ��size����
		for (int i = 0; i < list.size(); i++) {
			
			String name = list.get(i);
			System.out.println(name);
		}
	}
}
