package day09.demo04;

public class Student {
	// ��Ա����
	private String name;
	private int age;

	//�޲����Ĺ��췽��	
	public Student() {
		System.out.println("�޲���");
	}
	
	// ȫ�����Ĺ��췽��
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	// Getter Setter
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
