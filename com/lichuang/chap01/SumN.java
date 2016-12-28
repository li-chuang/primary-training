package com.lichuang.chap01;

import java.util.Scanner;

/**
 * 输入一个正整数n,计算从1到n的和
 *
 */
public class SumN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(addToN(number));
	}

	private static int addToN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
