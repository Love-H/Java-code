package day09.demo03;

public class Student {
	String name;
	int age;
	
	public Student() {
		System.out.println("无参数的构造方式执行啦！");
	}
	
	public Student(int num) {
		System.out.println("有参数的构造方式执行啦！" + num);	
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("我叫" + name + "，我今年" + age);
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
