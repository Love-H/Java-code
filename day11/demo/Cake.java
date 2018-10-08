package day11.demo;

public class Cake {
	private int size;
	private String fruit;
	private String milk;
	private String salt;

	public Cake() {
	}

	public Cake(int size) {
		this.size = size;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getSalt() {
		return salt;
	}
	
	public void setSalt(String salt) {
		this.salt = salt;
	}

}
