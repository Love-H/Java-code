package day09.demo04;

public class DemoPOJO {
	public static void main(String[] args) {
		Student one = new Student("HH",20);
		
		//�޸�����������
		one.setName("HJ");
		one.setAge(18);

		System.out.println("����" + one.getName() + " " + one.getAge() + "��");
	}
}
