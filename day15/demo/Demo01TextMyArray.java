package day15.demo;
//ʵ����������ӡ���ʾ����

public class Demo01TextMyArray {
	public static void main(String[] args) {
		MyArray one = new MyArray();
		one.insert(1);
		one.insert(23);
		one.insert(31);
		one.insert(64);
		one.insert(45);
		one.display();
		one.search(23);
	}
}
