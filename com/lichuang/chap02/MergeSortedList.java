package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.List;

/**
 * 合并两个有序的列表
 * 
 * 默认升序排列
 *
 */
public class MergeSortedList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		List<Integer> list = mergeSortedList(list1, list2);

		System.out.println(list);

	}

	private static List<Integer> mergeSortedList(List<Integer> list1,
			List<Integer> list2) {
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		int j = 0;

		int num1 = 0;
		int num2 = 0;
		while (i != list1.size() || j != list2.size()) {
			if(i < list1.size()){
				num1 = list1.get(i);
			}
			if(j <list2.size()){
				num2 = list2.get(j);
			}
			if (num1 <= num2) {
				list.add(num1);
				i++;
			} else {
				list.add(num2);
				j++;
			}
		}
		return list;
	}
}
