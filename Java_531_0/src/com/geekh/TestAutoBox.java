package com.geekh;

/**
 * �����Զ���װ��
 * @author geekH3334
 *
 */

public class TestAutoBox {
	
	public static void main(String[] args) {
		//�Զ�װ��
		Integer a = 234; //�൱�� Integer a = Integer.valueOf(234);
		System.out.println(a);
		//�Զ�����
		int b = a;
		System.out.println(b);
		
		System.out.println("-----------------");
		
//		Integer c =null;
//		int d = c;			Ϊʲô�ᱨ��(java.lang.NullPointerException)?
	
		//����[-128,127]֮������֣�ʵ�ʾ���ϵͳ��ʼ��ʱ�򣬴�����[-128,127]֮���һ����������
		//�����ǵ���valueOf()��ʱ�����ȼ���Ƿ���[-128,127]֮�䣬����������Χ��ֱ�Ӵӻ����������ó��Ѿ����õĶ���
		//������������Χ���򴴽��µ�Integer����
        Integer in1 = -128;
        Integer in2 = -128;
        System.out.println(in1 == in2);//Ϊʲô��ʾtrue�� ��Ϊ123�ڻ��淶Χ��
        System.out.println(in1.equals(in2)); //true
        
        System.out.println("-----------------");
        
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4);//false ��Ϊ1234���ڻ��淶Χ��
        System.out.println(in3.equals(in4)); //true
		
	}
	
}
