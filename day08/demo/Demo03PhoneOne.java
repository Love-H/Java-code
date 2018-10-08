package day08.demo;

public class Demo03PhoneOne {
	public static void main(String[] args) {
		//一键修改变量  Shift + Alt + r
		Phone One = new Phone();
		
		System.out.println(One.brand);
		System.out.println(One.color);
		System.out.println(One.price);
		
		One.call("LH");
		One.sendMessage();
		
		One.brand = "华为";
		One.color = "蓝色";
		One.price = 1314.0;

		System.out.println(One.brand);
		System.out.println(One.color);
		System.out.println(One.price);
		
	}
}
