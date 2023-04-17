package org.joonzis.city;

import java.util.Scanner;

public class Motel {
	private Scanner sc = new Scanner(System.in);
	
	public void motel_life() {
		System.out.println("여관주인 : 어서오세요 무엇이 필요하신가요?" + "\n1.식사\t2.취침\t3.나가기\n(1,2,3) : " );
		int select = sc.nextInt();
		Select_city c1 = new Select_city();
		if (select == 1) {
			System.out.println("밥 맛있게 먹었다. 미구현");
			motel_life();
		} else if (select == 2) {
			System.out.println("하룻밤 주무시겠습니까? (네,아니오) : ");
			String yes = sc.nextLine();
			if (yes.equals("네")) {
				System.out.println("하룻밤을 묵으셨습니다.");
				c1.select();
			} else if(yes.equals("아니오")) {
				motel_life();
			}
		} else if (select == 3) {
			c1.select();
		} else {
			System.out.println("다시 입력해주세요");
			motel_life();
		}
	}
}
