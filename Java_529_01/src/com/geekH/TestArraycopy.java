package com.geekH;

/***
 * ��������Ŀ���
 * @author geekH3334
 *
 */

public class TestArraycopy {
	public static void main(String[] args) {
//		testBasicCopy();
//		testBasicCopy2();
		String[] str = {"geek1", "geek2", "geek3", "geek4", "geek5"};
		
//		removeElment(str, 3);
		
		extendRange(str);
	}
	
	public static void testBasicCopy() {
		//���԰������е�Ԫ�ظ��Ƶ��µ����鵱��
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
	    String[] s2 = new String[10];
	    
	    System.arraycopy(s1, 0, s2, 0, 4);
	    
	    for (int i = 0; i < s2.length; i++) {
	    	System.out.println(i + "-->" + s2[i]);
	    }
	}
	
	public static void testBasicCopy2() {
		//���԰������е�ĳһԪ��ɾ��
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
	    String[] s2 = new String[10];
	    
	    System.arraycopy(s1, 3, s1, 2, s1.length-3);
	    
	    s1[s1.length-1] = null;
	    
	    for (int i = 0; i < s1.length; i++) {
	    	System.out.println(i + "-->" + s1[i]);
	    }
	}
	
	public static String[] removeElment(String[] s, int index) {
		System.arraycopy(s, index, s, index-1, s.length-index);
		
	    s[s.length-1] = null;
	    
	    for (int i = 0; i < s.length; i++) {
	    	System.out.println(i + "-->" + s[i]);
	    }
	    
	    for (String temp:s) {
	    	System.out.println(temp);
	    }
		
		return s;
	}
	
	public static String[] extendRange (String[] s) {
		// ��������
		String[] s1 = new String[s.length + 10];
		
		System.arraycopy(s, 0, s1, 0, s.length);
		
		int count = 1;
		for (String tempt:s1) {
			System.out.println(count + "-->" +tempt);
			count++;
		}
		
		return s1;
	}
	
}



























