package com.geekH;

/**
 * 
 * @author geekH3334
 *
 */

public class TestEquals_01 {
	public static void main(String[] args) {
        Person p1 = new Person(123,"geek");
        Person p2 = new Person(123,"geek123");     
        System.out.println(p1==p2);     //false，不是同一个对象
        System.out.println(p1.equals(p2));  //true，id相同则认为两个对象内容相同
        String s1 = new String("geek");
        String s2 = new String("geek");
        System.out.println(s1==s2);         //false, 两个字符串不是同一个对象
        System.out.println(s1.equals(s2));  //true,  两个字符串内容相同
    }
}
class Person {
    int id;
    String name;
    public Person(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else {
            if(obj instanceof Person) {
                Person c = (Person)obj;
                if(c.id==this.id) {
                    return true;
                }
            }
        }
        return false;
    }
}
