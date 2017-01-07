package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.List;

/**
 * 连接两个列表
 * 连接多个列表
 *
 */
public class ConcatList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		List<String> list2 = new ArrayList<String>();
		list2.add("X");
		list2.add("Y");
		list2.add("Z");
		List<String> list = concat(list1, list2);
		System.out.println(list);
		
	}
	
	private static List<String> concat(List<String> list1,List<String> list2){
		List<String> list = new ArrayList<String>();
		list.addAll(list1);
		list.addAll(list2);
		return list;
	}
}
