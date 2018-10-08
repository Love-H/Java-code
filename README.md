
public class Demo01WhileSum {
	public static void main(String[] args) {
		int num = 0,sum = 0;
		while(num != 0) {
			sum = sum + num;
			num++;
		}
	}
}

public class Demo01WhileSum {
	public static void main(String[] args) {
		int sum = 0,num = 1;
		while(num <= 100) {
			if(num % 2 != 0) {
				sum += num;
			}
			num++;
		}
		System.out.println(sum);
	}
}
