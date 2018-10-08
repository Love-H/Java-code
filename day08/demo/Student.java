package day08.demo;
/*
 * 定义一个类，用来模拟现实事物“学生”
 * 
 * 学生有两个组成部分
 * 属性：名字、年龄
 * 行为：吃饭、睡觉、学习
*/
public class Student {
	
	//成员变量
	String name;
	int age;
	
	//成员方法
	public void eat() {
		System.out.println("吃饭饭！");
	}
	
	public void sleep() {
		System.out.println("睡觉觉！");
	}
	
	public void study() {
		System.out.println("学习！");
	}
}
