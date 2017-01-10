package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回指定数的各位数字的列表
 * 
 *
 */
public class BitList {

	public static void main(String[] args) {
		List<Integer> list = getBit(213);
		System.out.println(list);
	}
	
	private static List<Integer> getBit(int number){
		List<Integer> list = new ArrayList<Integer>();
		int leave = number/10;
		while(leave >= 10){
			int bit = number % 10;
			list.add(bit);
			leave = number/10;
		}
		return list;
	}
}
