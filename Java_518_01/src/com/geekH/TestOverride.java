package com.geekH;

/**
 * 
 * @author geekH
 *
 */

public class TestOverride {
	public static void main(String[] args) {
		
		Horse h = new Horse();
		h.run();
		h.stop();
		Plane p = new Plane();
		p.run();
		p.stop();
	}
}

class Per {
	public void run() {
		System.out.println("��......");
	}
	
	public void stop() {
		System.out.println("ֹͣ��");
	}
}

class Horse extends Per {
	public void run() {
		System.out.println("�ö���......");
	}
}

class Plane extends Per {
	public void run() {
		System.out.println("��ѽ��......");
	}
	
	public void stop() {
		System.out.println("���ܿ���ͣ����׹�٣�");
	}
}

/*
 	Summary��
 		public Person {};
 		��ΪPerson��ͬ���µ�extends_instanceof.java��, �Ѿ�����Person����������壬��֪���ü̳��ĸ�
 */
