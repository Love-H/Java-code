package com.geekh;

/**
 * ���԰�װ�����;
 * @author geekH3334
 *
 */

public class TestInteger {
	
    public static void main(String[] args) {
        TestInteger geekh = new TestInteger();
        geekh.TestIntegerInteger();
    }
	
    void TestIntegerInteger() {
        // ��������ת����Integer����
        Integer int1 = new Integer(10);
        Integer int2 = Integer.valueOf(20); // �ٷ��Ƽ�����д��
        // Integer����ת����int
        int a = int1.intValue();
        // �ַ���ת����Integer����
        Integer int3 = Integer.parseInt("334");
        Integer int4 = new Integer("999");
        // Integer����ת�����ַ���
        String str1 = int3.toString();
        // һЩ����int������صĳ���
        System.out.println("int�ܱ�ʾ�����������" + Integer.MAX_VALUE); 
    }

}
