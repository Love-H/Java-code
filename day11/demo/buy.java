package day11.demo;

public class buy {
	public static void main(String[] args) {
		Cake one = new Cake(25);
		one.setFruit("苹果");
		one.setMilk("蒙牛");
		one.setSalt("微咸");
		
		System.out.println("定制一个" + one.getSalt() + "的" + one.getFruit() + one.getMilk() + "蛋糕");
	}	
}

