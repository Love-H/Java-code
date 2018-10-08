package day10.demo01;

public class Demo06Replace {
	public static void main(String[] args) {
		//使用replace代替脏字
		String str1 = "你大爷的，会不会打啊";
		String str2 = str1.replace("你大爷的", "****");
		System.out.println(str2);
		
		//猜猜此时打印str1，结果是什么？
		System.out.println(str1);
	}
}
