package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.List;

/**
 * 写函数逆转列表，最好是原地逆转
 *
 */
public class ReversTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(reverse(list));
		
	}
	
	private static List<String> reverse(List<String> list){
		String tmp = null;
		int count = list.size();
		for(int i=0;i<count/2;i++){
			tmp = list.get(i);
			list.set(i, list.get(count-i-1));
			list.set(count-i-1, tmp);
		}
		return list;
	}

}
