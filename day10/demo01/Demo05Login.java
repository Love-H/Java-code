package day10.demo01;
/*
 * ���׵�½����
 * ������
 * 1�������û���������  Scanner
 * 2���Ƚ��Ƿ���ȷ          if
 * 3.��½�ɹ�����ʾ��ӭ��Ϣ����ʧ�����˳�ϵͳ
*/
import java.util.Scanner;
public class Demo05Login {
	public static void main(String[] args) {
		//����ע��ʱ��ָ��һ����ȷ���û���������
		String regisUsername = "LH";
		String regisPassword = "123456";
		
		//��Ҫ��������ץȡ�û���д����Ϣ
		Scanner sc = new Scanner(System.in);
		for(int i = 2;i >= 0;i--) {
		System.out.println("�������û���");
		String inputUsername = sc.next();
		System.out.println("����������");
		String inputPassword = sc.next();
		
		/*
		 * �ж��Ƿ���ȷ
		 * 1.�û���һ�㲻���ִ�Сд�������ж�Ӧ����equalsIgnoreCase
		 * 2.����һ�����ϸ����ִ�Сд�ģ����������ж�Ӧ����equals
		 * 3.������ͬʱ��ȷ���У�������&&
		*/
			if(regisUsername.equalsIgnoreCase(inputUsername) && regisPassword.equals(inputPassword)) {
				System.out.println("��½�ɹ�");
				break;
			} else {
				if(i == 0) {
					System.out.println("��¼ʧ�ܣ��˳�ϵͳ");
				}	else {
				System.out.println("��ʣ��" + i + "�ε�½����");
				}
			}
		}
		
	}

}
