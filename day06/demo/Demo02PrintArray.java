package day06.demo;
/*
 * 定义一个方法，用来对数组进行遍历
 * 
  * 分析
 *	1.需要一个数组
 *	2.定义一个方法 三要素
 *		返回值类型：只是进行打印显示，没有结果数据，所以用void；
 *		方法名称：printArray
 *		参数：一个数组		
 *	3.调用方法	  		
*/
public class Demo02PrintArray {	
	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50,100};
		printArray(array1);
	}
	
	public static void  printArray(int[] a) {
		System.out.print("[");						//print后有无ln的区别
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
