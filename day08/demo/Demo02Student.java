package day08.demo;

public class Demo02Student {
	public static void main(String[] args) {
		//���������ʽ
		//������ �������� = new �����ƣ���;
		Student hj = new Student();
			System.out.println(hj.name);
			System.out.println(hj.age);
		
		// �ı��Ա����
			hj.name = "��";
			hj.age = 20;
			System.out.println(hj.name);
			System.out.println(hj.age);
			
			String name = hj.name;
			System.out.println(name);
			
		// ʹ�ö����еĳ�Ա����
			hj.eat();
	}
}
