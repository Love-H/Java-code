package day04.demo;

//求数组当中的最小值
public class Demo01ArrayMax {
	public static void main(String[] args) {
		//创建一个静态数组
		int[] Array1 = {5,51,68,12,78,3,900};
		int min = Array1[0];
		
		//遍历求出最小值
		for(int i = 0;i < Array1.length;i++) {
			if(min > Array1[i]) {
				min = Array1[i];
			}
			
		}
		
		System.out.println("最小值："+min);
	
	}
}
