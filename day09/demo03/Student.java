package day09.demo03;

public class Student {
	String name;
	int age;
	
	public Student() {
		System.out.println("�޲����Ĺ��췽ʽִ������");
	}
	
	public Student(int num) {
		System.out.println("�в����Ĺ��췽ʽִ������" + num);	
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("�ҽ�" + name + "���ҽ���" + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
