package com.geekh;


public class TestArrayList {
	private Object[] elementDate;
	private int size;
	
	private static final int DEFAL_CAPACITY = 10;

	public static void main(String[] args) {
		TestArrayList aList = new TestArrayList(15);
		aList.addpend("aa");
		aList.addpend("geek");
		aList.addpend("h");
		System.out.println(aList);
	}

	public TestArrayList() {
		elementDate = new Object[DEFAL_CAPACITY];
	}
	
	public TestArrayList(int capacity) {
		elementDate = new Object[capacity];
	}
	
	public void addpend(Object num) {
		elementDate[size++] = num;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elementDate[i] + ",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
}
