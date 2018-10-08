package day10.demo01;

public class Demo04StringPool {
	public static void main(String[] args) {
		char[] array = {'a','b','c'}; 
		String str1 = new String(array);

		String str2 = "abc";
		System.out.println(str1==str2);
		
		//进行内容比较，使用equals方法
		//拿str1和str2进行内容比较
		//不要使用==，因为==比较的是地址
		boolean same = str1.equals(str2);
		System.out.println(same);
		
//		如果equal方法需要比较的两个字符串当中有一个是常量，尽量将常量写在前面
		System.out.println(str1.equals("abc"));
		System.out.println("abc".equals(str1));
		
		String str3 = null;
		System.out.println(str3.equals("abc"));
		System.out.println("abc".equals(str3));
	}
}
