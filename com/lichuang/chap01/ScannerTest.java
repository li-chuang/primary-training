package com.lichuang.chap01;

import java.util.Scanner;

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
		 
	}

}
