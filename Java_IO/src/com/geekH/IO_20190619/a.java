package com.geekH.IO_20190619;

import java.util.ArrayList;
import java.util.List;

public class a {
	public static void main(String[] args) {
		List<Integer> NumberList = new ArrayList<Integer>();
		NumberList.add(2);
		NumberList.add(4);
		NumberList.add(1);
		NumberList.add(3);
		NumberList.add(5);
		for(int i =0;i<NumberList.size();++i){
			int v = NumberList.get(i);
			System.out.println(v);
			if(v%2==0){
				NumberList.remove(v);
			}
		}
		System.out.println(NumberList);
	}
}
