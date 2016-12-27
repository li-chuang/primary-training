package com.lichuang.chap01;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println(name+" , 你好~");
		
		int number = scanner.nextInt();
		System.out.println("年龄 :"+ number);
		 
	}

}
