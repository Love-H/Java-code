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
		System.out.println("跑......");
	}
	
	public void stop() {
		System.out.println("停止！");
	}
}

class Horse extends Per {
	public void run() {
		System.out.println("得儿驾......");
	}
}

class Plane extends Per {
	public void run() {
		System.out.println("飞呀飞......");
	}
	
	public void stop() {
		System.out.println("不能空中停机，坠毁！");
	}
}

/*
 	Summary：
 		public Person {};
 		因为Person在同包下的extends_instanceof.java中, 已经有了Person，会产生歧义，不知道该继承哪个
 */
