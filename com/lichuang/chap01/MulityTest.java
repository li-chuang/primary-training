package com.lichuang.chap01;

import java.text.DecimalFormat;

/**
 * 打印乘法表
 * @author ASUS
 *
 */
public class MulityTest {
	public static void main(String[] args) {
		mulity(12);
	}
	
	private static void mulity(int n){
		//DecimalFormat format = new DecimalFormat("0000");
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=i;j++){
				//System.out.print(format.format(j)+" * "+format.format(i) +" = " +format.format(i*j)+"  ");
				//String.format("%04d", youNumber)
				System.out.print(String.format("%3d", j)+" *"+String.format("%3d", i) +" =" +String.format("%3d", i*j)+"  ");
				
			}
			System.out.println("");
		}
	}

}
