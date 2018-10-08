package day10.demo01;

import java.util.ArrayList;

public class Demo10Couster {
	public static void main(String[] args) {
		//创建Person对象
		Person one = new Person("LH",18);
		Person two = new Person("HH",19);
		Person three = new Person("LL",20);
		
		//准备一个集合，用来存放多个对象；
		ArrayList<Person> list = new ArrayList<>();
		
		//将对象添加到集合当中；
		list.add(one);
		list.add(two);
		list.add(three);
		
		for (int i = 0; i < list.size(); i++) {
	

			Person per = list.get(i);	
			System.out.println("姓名：" + per.getName() + ",年龄" + per.getAge());
			
		}
		
	}
}























