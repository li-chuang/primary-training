package com.lichuang.chap01;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 * 自动生成一个100以内的正整数，猜出此数字并记录猜测次数
 */
public class GuessNumber {
	
	public static void main(String[] args) {
		Random random = new Random();
		int guessNumber = random.nextInt(100);
		
		boolean isContinue = true;
		int count = 0;
		
		guess(guessNumber, isContinue, count);
	
	}

	private static void guess(int guessNumber, boolean isContinue, int count) {
		System.out.println("游戏开始！");
		while(isContinue){		
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			if(number == guessNumber){
				System.out.println("回答正确！！！");
				isContinue = false;
			} else if(number > guessNumber){
				System.out.println("太大了");
			} else{
				System.out.println("太小了");
			}
			count++;
		}
		System.out.println("游戏结束！回答总次数："+count);
	}
	
}
