package day10.demo01;

import java.util.ArrayList;

public class Demo10Couster {
	public static void main(String[] args) {
		//����Person����
		Person one = new Person("LH",18);
		Person two = new Person("HH",19);
		Person three = new Person("LL",20);
		
		//׼��һ�����ϣ�������Ŷ������
		ArrayList<Person> list = new ArrayList<>();
		
		//��������ӵ����ϵ��У�
		list.add(one);
		list.add(two);
		list.add(three);
		
		for (int i = 0; i < list.size(); i++) {
	

			Person per = list.get(i);	
			System.out.println("������" + per.getName() + ",����" + per.getAge());
			
		}
		
	}
}























