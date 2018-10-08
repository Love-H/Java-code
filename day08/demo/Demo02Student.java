package day08.demo;

public class Demo02Student {
	public static void main(String[] args) {
		//创建对象格式
		//类名称 对象名称 = new 类名称（）;
		Student hj = new Student();
			System.out.println(hj.name);
			System.out.println(hj.age);
		
		// 改变成员变量
			hj.name = "涵";
			hj.age = 20;
			System.out.println(hj.name);
			System.out.println(hj.age);
			
			String name = hj.name;
			System.out.println(name);
			
		// 使用对象当中的成员方法
			hj.eat();
	}
}
