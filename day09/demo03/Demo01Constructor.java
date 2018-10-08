package day09.demo03;

public class Demo01Constructor {
	public static void main(String[] args) {
		Student hj = new Student();
		Student lh = new Student(18);
		Student jj = new Student("HJ",18);
		
		jj.setName("LH");
		jj.setAge(20);
		System.out.println("我叫" + jj.name + "，我今年" + jj.age);
		
	}
}
