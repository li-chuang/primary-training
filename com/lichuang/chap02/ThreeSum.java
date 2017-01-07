package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 计算列表中数字的和：分别用for循环，while循环和递归完成
 *
 */
public class ThreeSum {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int sum1 = forSum(list);
		int sum2 = forIterator(list);
		System.out.println(sum1);
		System.out.println(sum2);
	}
	
	private static int forSum(List<Integer> list){
		int sum = 0;
		for(Integer number : list){
			sum += number;
		}	
		return sum;		
	}
	
	private static int forIterator(List<Integer> list){
		int sum = 0;
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			Integer integer = (Integer) iter.next();
			sum += integer;
		}
		return sum;
	}

}
