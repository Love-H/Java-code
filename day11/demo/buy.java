package day11.demo;

public class buy {
	public static void main(String[] args) {
		Cake one = new Cake(25);
		one.setFruit("ƻ��");
		one.setMilk("��ţ");
		one.setSalt("΢��");
		
		System.out.println("����һ��" + one.getSalt() + "��" + one.getFruit() + one.getMilk() + "����");
	}	
}

