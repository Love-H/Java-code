package day10.demo01;

public class Demo04StringPool {
	public static void main(String[] args) {
		char[] array = {'a','b','c'}; 
		String str1 = new String(array);

		String str2 = "abc";
		System.out.println(str1==str2);
		
		//�������ݱȽϣ�ʹ��equals����
		//��str1��str2�������ݱȽ�
		//��Ҫʹ��==����Ϊ==�Ƚϵ��ǵ�ַ
		boolean same = str1.equals(str2);
		System.out.println(same);
		
//		���equal������Ҫ�Ƚϵ������ַ���������һ���ǳ���������������д��ǰ��
		System.out.println(str1.equals("abc"));
		System.out.println("abc".equals(str1));
		
		String str3 = null;
		System.out.println(str3.equals("abc"));
		System.out.println("abc".equals(str3));
	}
}
