package org.joonzis.city;

import java.util.Scanner;

public class Shop {
	private Scanner sc = new Scanner(System.in);
	Select_city secy;
	
	public void shop() {
		System.out.print("어서오세요, 어떤 물건이 필요하신가요? "
				+ "\n1.무기,방어구\t2.소모품\t3.나가기\n(1,2,3)  : ");
		int select = sc.nextInt();
		
		if (select == 1) {
			System.out.println("미구현 \n");
			shop();
		} else if (select == 2) {
			System.out.println("미구현 \n");
			shop();
		} else if (select == 3) {
			secy = new Select_city();
			secy.select();
		} else {
			System.out.println("다시 입력해주세요");
			shop();
		}
		
		
		
	}
}
