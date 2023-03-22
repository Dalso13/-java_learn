package org.joonzis.ex;

import java.util.Scanner;

public class Ex01_input {
	public static void main(String[] args) {
		
		
		
		//1, Scanner 객체(인스턴스) 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		String name = sc.nextLine();  // 문자열(엔터까지)
		
		System.out.print("나이 입력 >> ");
		
		int age = sc.nextInt();
		
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
		
		sc.nextLine(); // nextInt();, nextDouble();의 개행 문자 삭제 (이 둘은 엔터가 자동으로 되서  다음올 넥스트 라인이 안먹힘)
		
		System.out.print("성별 입력 >> ");
		String gender = sc.nextLine();
		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		
		// 스캐너 객체 소멸
		sc.close();
		
	}
}
