package day15.demo;
/*ʵ����������ӡ���ʾ����
*/
public class MyArray {
	private long[] array;
	//��ʾ��Ч���ݵĳ���
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
	
	
	//��������
	public void insert(long num) {
		array[elements] = num;
		elements++;
	}
	
	//��ʾ����
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
	
	//��������
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
