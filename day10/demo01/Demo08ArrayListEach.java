package day10.demo01;

import java.util.ArrayList;

public class Demo08ArrayListEach {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//添加
		list.add("LH");
		list.add("HJ");
		list.add("MM");
		
		System.out.println(list);
		
		//遍历输入每一个字符串对象
		//集合的长度获取：size（）
		for (int i = 0; i < list.size(); i++) {
			
			String name = list.get(i);
			System.out.println(name);
		}
	}
}
