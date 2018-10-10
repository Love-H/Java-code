package day15.demo;
/*实现数组里添加、显示数据
*/
public class MyArray {
	private long[] array;
	//表示有效数据的长度
	private int elements;
	
	public MyArray() {
		array = new long[50];
	}
	
/*
 	public MyArray(long elemments) {
		this.elements = elements;
	}
*/
	
	public MyArray(int maxsize ) {
		array = new long[maxsize];
	}
	
	
	//插入数据
	public void insert(long num) {
		array[elements] = num;
		elements++;
	}
	
	//显示数据
	public void display() {
		System.out.print("[");
		for (int i = 0; i < elements; i++) {
			if(i == elements - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.print("]");
	}
	
	//查找数据
	public void search(long num) {
		int count = 1;
		for (int i = 0; i < elements; i++) {
			if(num == array[i]) {
				break;
			} else {
				;
			}
		}
	}
}
