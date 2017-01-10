package com.lichuang.chap02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 返回指定数的各位数字的列表
 * 
 */
public class BitList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		List<Integer> list = getBit(count);
		List<Integer> result = new ArrayList<Integer>();
		int size = list.size();
		for (int i = 0; i < size; i++) {
			result.add(list.get(size - i - 1));
		}
		System.out.println(result);
	}

	private static List<Integer> getBit(int number) {
		List<Integer> list = new ArrayList<Integer>();
		// int leave = number/10;
		while (number > 0) {
			int bit = number % 10;
			list.add(bit);
			number = number / 10;
		}
		return list;
	}
	
}
