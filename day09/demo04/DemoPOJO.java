package day09.demo04;

public class DemoPOJO {
	public static void main(String[] args) {
		Student one = new Student("HH",20);
		
		//修改姓名和年龄
		one.setName("HJ");
		one.setAge(18);

		System.out.println("姓名" + one.getName() + " " + one.getAge() + "岁");
	}
}
