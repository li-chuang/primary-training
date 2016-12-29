package com.lichuang.chap01;

/**
 * 打印乘法表
 * @author ASUS
 *
 */
public class MulityTest {
	public static void main(String[] args) {
		mulity(9);
	}
	
	private static void mulity(int n){
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j+" * "+i +" = " +i*j+"\t");
			}
			System.out.println("");
		}
	}

}
