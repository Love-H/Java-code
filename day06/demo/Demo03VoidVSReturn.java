package day06.demo;

//���޷���ֵ������
public class Demo03VoidVSReturn {
	public static void main(String[] args) {
		//����һ����̬����
		int[] array = {10,20,30,40,50};
		
		
		int result = sumA(array);
		System.out.println("��ӡ�õ��Ľ����:"+result);
		
		sumB(array);
	}
	
	//�з���ֵ
	public static int sumA(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			
		}
		return sum;
	}
	
	//�޷���ֵ
	public static void sumB(int[] b) {
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
	}
	
}
