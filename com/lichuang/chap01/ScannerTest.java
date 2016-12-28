package com.lichuang.chap01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println(name+" , 你好~");
		
		int number = scanner.nextInt();
		System.out.println("年龄 :"+ number);
		
		boolean isNumber = scanner.hasNextInt();
		if(isNumber){		
			System.out.println("输入的是数字");
		} else {
			System.out.println("输入的不是数字");
		}
		
		scanner = new Scanner("我的手机号码是13942583366邮编是430100");
		Pattern pattern1 = Pattern.compile("[0-9]{11}");
		Pattern pattern2 = Pattern.compile("[0-9]{6}");
		String phoneNumber = scanner.findInLine(pattern1);
		String mailNumber = scanner.findInLine(pattern2);
		System.out.println("我的手机号码是： "+ phoneNumber);
		System.out.println("我的邮编是："+ mailNumber);
		 
	}

}
