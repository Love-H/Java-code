package day04.demo;

//�����鵱�е���Сֵ
public class Demo01ArrayMax {
	public static void main(String[] args) {

		int[] Array1 = {5,51,68,12,78,3,900};
		int min = Array1[0];

		for(int i = 0;i < Array1.length;i++) {
			if(min > Array1[i]) {
				min = Array1[i];
			}
			
		}
		
		System.out.println("��Сֵ��"+min);
	
	}
}
