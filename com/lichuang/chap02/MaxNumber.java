package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 写一个函数，返回列表中最大的数
 *
 */
public class MaxNumber {

	public static void main(String[] args) {
		Integer[] numbers = new Integer[]{12,15,25,36,54,86,56,98,44,38,45,99,76,81,73};
		List<Integer> list = Arrays.asList(numbers);
		int max = getMaxNumber(list);
		System.out.println(max);
		
		//List<Integer> list = new ArrayList<Integer>();
		//list.addAll(numbers);
		
	}
	
	private static int getMaxNumber(List<Integer> list){
		int max = 0;
		for(int number: list){
			if(number > max){
				max = number;
			}
		}
		return max;
	}
}
