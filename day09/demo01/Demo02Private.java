package day09.demo01;

public class Demo02Private {
	public static void main(String[] args) {
		Person person = new Person();
		person.show();
//		person.age = 18;
		person.setAge(-20);
		person.show();
	}
}
