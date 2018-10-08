package day10.demo01;
/*
 * 简易登陆界面
 * 分析：
 * 1，输入用户名和密码  Scanner
 * 2，比较是否正确          if
 * 3.登陆成功后显示欢迎信息，若失败则退出系统
*/
import java.util.Scanner;
public class Demo05Login {
	public static void main(String[] args) {
		//首先注册时，指定一个正确的用户名和密码
		String regisUsername = "LH";
		String regisPassword = "123456";
		
		//需要键盘输入抓取用户填写的信息
		Scanner sc = new Scanner(System.in);
		for(int i = 2;i >= 0;i--) {
		System.out.println("请输入用户名");
		String inputUsername = sc.next();
		System.out.println("请输入密码");
		String inputPassword = sc.next();
		
		/*
		 * 判断是否正确
		 * 1.用户名一般不区分大小写，内容判断应该用equalsIgnoreCase
		 * 2.密码一定是严格区分大小写的，所以内容判断应该用equals
		 * 3.需两者同时正确才行，所以用&&
		*/
			if(regisUsername.equalsIgnoreCase(inputUsername) && regisPassword.equals(inputPassword)) {
				System.out.println("登陆成功");
				break;
			} else {
				if(i == 0) {
					System.out.println("登录失败，退出系统");
				}	else {
				System.out.println("还剩余" + i + "次登陆机会");
				}
			}
		}
		
	}

}
