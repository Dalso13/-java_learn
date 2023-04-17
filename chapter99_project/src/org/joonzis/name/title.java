package org.joonzis.name;

import java.util.Scanner;

import org.joonzis.city.Start;

public class title {
	private String title;
	private Scanner sc = new Scanner(System.in);
	Start start = new Start();
	
	public void name() {
		System.out.println("\t\t 구트 게임\n");
		System.out.println("1. 게임시작" + "\t2. 이어 하기" + "\t3. 게임 종료");
		System.out.print("선택 : ");
		int select = sc.nextInt();
		if (select == 1) {
			start.setName();
		} else if (select == 2) {
			System.out.println("미구현");
		} 	
	}

	
	
	
	
}
