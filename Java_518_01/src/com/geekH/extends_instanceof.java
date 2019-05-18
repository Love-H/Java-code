package com.geekH;

/**
 * 
 * @author geekH
 *
 */

public class extends_instanceof {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "geekH";
		stu.height = 175;
		stu.rest();
		stu.study();
		System.out.println(stu.name+" "+stu.height);
		
		Student stu1 = new Student("geekH3334", 180, "CS");
		stu1.rest();
		stu1.study();
		System.out.println(stu1.name+" "+stu1.height+" "+stu1.major);
	}
	
}

class Person {
	String name;
	int height;
	
	public void rest() {
		System.out.print("Have a break!");
	}
}

class Student  extends Person {
	String major;
	
	public void study() {
		System.out.println("Go to study!");
	}
	
	public Student(String name, int height, String major) {
		this.name = name;
		this.height = height;
		this.major = major; 
	}
	
	public Student() {
		
	}
}










