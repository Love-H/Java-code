package day06.demo;
/*
 * ����һ��������������������б���
 * 
  * ����
 *	1.��Ҫһ������
 *	2.����һ������ ��Ҫ��
 *		����ֵ���ͣ�ֻ�ǽ��д�ӡ��ʾ��û�н�����ݣ�������void��
 *		�������ƣ�printArray
 *		������һ������		
 *	3.���÷���	  		
*/
public class Demo02PrintArray {	
	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50,100};
		printArray(array1);
	}
	
	public static void  printArray(int[] a) {
		System.out.print("[");						//print������ln������
		for(int i = 0;i < a.length;i++) {
			
			if(i < a.length -1) {
			System.out.print(a[i]+",");
			}
			
			else {
				System.out.print(a[i]+"]");
				
			}
		}

	}
	
}
