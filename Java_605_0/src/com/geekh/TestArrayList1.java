package com.geekh;

import java.util.ArrayList;

/**
 * 数组扩容
 * @author geekH3334
 *
 */

public class TestArrayList1 {
	private Object[] elementData;
	private int size;
	
	public static void main(String[] args) {
		
//		TestArrayList aList = new TestArrayList(); 	// 排查了半天，发现居然是用错方法声明数组了......
		
		TestArrayList1 aList = new TestArrayList1();

		for (int i = 0; i < 30; i++) {
			aList.add("geek" + i);
		}
		
		System.out.println(aList);
	}
	
	private static final int DEFAL_CAPACITY = 10;

	public TestArrayList1() {
		elementData = new Object[DEFAL_CAPACITY];
	}
	
	public TestArrayList1(int capacity) {
		elementData = new Object[capacity];
		ArrayList l;
	}
	
	public void add(String num) {
		
		// 什么时候扩容？
		if (size == elementData.length) {
			// 怎么扩容？
			Object[] newAList = new Object[elementData.length + (elementData.length>>1)];
			System.arraycopy(elementData, 0, newAList, 0, elementData.length);
			
			elementData = newAList;
		}
		
		elementData[size++] = num;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elementData[i] + ",");
		}
		sb.setCharAt(sb.length()-1, ']');
		
		return sb.toString();
	}
	
}
