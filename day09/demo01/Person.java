package day09.demo01;

public class Person {
	String name;
	private int age;
	
	public void show() {
		System.out.println("�ҽ�" + name + ",����" + age + "��");
	}
	
	public void setAge(int num) {
		if (num < 0 || num > 200) {
			System.out.println("���ݴ���");
		} else {
			age = num;
		}
	}
	
	public int getAge() {
		return age;
	}
}
