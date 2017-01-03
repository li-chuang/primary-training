package com.lichuang.chap01;

import java.util.Calendar;

/**
 * 打印出接下来的n个闰年
 *
 */
public class SpecialYear {

	public static void main(String[] args) {
		getSpecialYear(20);
	}

	private static void getSpecialYear(int number) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		while (number != 0) {
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("第" + (20 - number + 1) + "闰年：" + year);
				number--;
			} 
			year++;
		}
	}

}
