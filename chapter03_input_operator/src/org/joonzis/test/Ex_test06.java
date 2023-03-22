package org.joonzis.test;

import java.util.Scanner;

public class Ex_test06 {
	public static void main(String[] args) {
//		Test06.java
//		Q. 섭씨 화씨 변환기
//		      섭씨를 입력하면 변환된 화씨, 화씨를 입력하면 변환된 섭씨 출력하기
//		★화씨 = 섭씨 * 1.8 +32
//		  섭씨 = (화씨 -32) / 1.8
		
		Scanner ipt = new Scanner(System.in);
		
		System.out.print("온도 적기 : ");
		double su = ipt.nextDouble();
		
		
		
		System.out.println( (su * 1.8 + 32) + "," + ((su - 32)/ 1.8 ));
	}
}
