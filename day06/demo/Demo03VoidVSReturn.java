package day06.demo;

//有无返回值的区别
public class Demo03VoidVSReturn {
	public static void main(String[] args) {
		//创建一个静态数组
		int[] array = {10,20,30,40,50};
		
		
		int result = sumA(array);
		System.out.println("打印得到的结果是:"+result);
		
		sumB(array);
	}
	
	//有返回值
	public static int sumA(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			
		}
		return sum;
	}
	
	//无返回值
	public static void sumB(int[] b) {
		int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
	}
	
}
