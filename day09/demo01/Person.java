package day09.demo01;

public class Person {
	String name;
	private int age;
	
	public void show() {
		System.out.println("我叫" + name + ",今年" + age + "岁");
	}
	
	public void setAge(int num) {
		if (num < 0 || num > 200) {
			System.out.println("数据错误");
		} else {
			age = num;
		}
	}
	
	public int getAge() {
		return age;
	}
}
