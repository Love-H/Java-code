package com.geekH;

/**
 * ���Է�װ��� 
 * @author geekH3334
 *
 */

public class TestEncapsulation {
	private int sid;
	
	
	public static void main(String[] args) {
		
		TestEncapsulation t = new TestEncapsulation();
		t.sid = 10;
		System.out.println(t.sid);
		
		Person1 p1 = new Person1();
//		p1.id = 10;	������Ϊ id �� private,ֻ����ͬһ������ʹ��
		
	}
}

class Person1 {
	private int id;
	String name;
	protected int age;
	public String sex;

}




