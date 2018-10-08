package day10.demo01;

import java.util.ArrayList;

/*
 * 集合泛型必须是引用类型，不能是基本类型
 * 如果一定储存基本数据，那么就要使用基本类型对应的“包装类” （全部位于java.lang包下，有8种）
 * 
 * 基本类型  对应的包装类
 * byte		Byte
 * short	Short
 * int		Integer
 * long 	Long
 * float	Float
 * double	Double
 * char 	Charcter
 * boolean	Boolean
 * 	
*/
public class Demo09ArrayListWrapper {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<>();
		//添加数据
		list.add(100);
		list.add(200);
		list.add(300);
		
		//遍历输出
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
	}
}






