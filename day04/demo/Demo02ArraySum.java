package day04.demo;

//������Ԫ�غ�

public class Demo02ArraySum {
	public static void main(String[] args) {
		//����һ����̬����
		int[] Array1 = {12,74,98,63,45,82};
		int sum = 0;
		for(int i = 0;i < Array1.length;i++) {
			sum += Array1[i]; 
		}
		System.out.println("�������Ϊ:"+sum);
	}
}
