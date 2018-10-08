package day09.demo04;

public class Student {
	// 成员变量
	private String name;
	private int age;

	//无参数的构造方法	
	public Student() {
		System.out.println("无参数");
	}
	
	// 全参数的构造方法
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
