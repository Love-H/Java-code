package day10.demo01;

import java.util.ArrayList;

/*
 * ���Ϸ��ͱ������������ͣ������ǻ�������
 * ���һ������������ݣ���ô��Ҫʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ ��ȫ��λ��java.lang���£���8�֣�
 * 
 * ��������  ��Ӧ�İ�װ��
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
		//�������
		list.add(100);
		list.add(200);
		list.add(300);
		
		//�������
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
	}
}






