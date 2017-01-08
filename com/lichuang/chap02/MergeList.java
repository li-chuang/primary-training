package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.List;

/**
 * 交替合并两个列表，例如：[a,b,c], [1,2,3] → [a,1,b,2,c,3]
 *
 */
public class MergeList {

	public static void main(String[] args) {
		List<Object> list1 = new ArrayList<Object>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		List<Object> list2 = new ArrayList<Object>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		List<Object> list = new ArrayList<Object>();
		if(list1.size() >= list2.size()){
			list = mergeList(list1, list2);
		} else {
			list = mergeList(list2, list1);
		}
		System.out.println(list);
		
	}
	
	private static List<Object> mergeList(List<Object> list1,List<Object> list2){
		List<Object> list = new ArrayList<Object>();
		int i = 0;
		int j = 0;
		while(i<list1.size() && j<list2.size()){
			list.add(list1.get(i++));
			list.add(list2.get(j++));
		}
		
		return list;
	}
	
}
