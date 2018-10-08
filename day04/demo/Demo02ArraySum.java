package day04.demo;

//求数组元素和

public class Demo02ArraySum {
	public static void main(String[] args) {
		//创建一个静态数组
		int[] Array1 = {12,74,98,63,45,82};
		int sum = 0;
		for(int i = 0;i < Array1.length;i++) {
			sum += Array1[i]; 
		}
		System.out.println("该数组和为:"+sum);
	}
}
