package org.joonzis.city;

import java.util.Scanner;

import org.joonzis.status.PlayerStatus;

public class Start{
	private Select_city scy = new Select_city();
	private Scanner sc = new Scanner(System.in);
	private String yes1;
	private String name;
	PlayerStatus play = new PlayerStatus();
	
	
	
	public void setName() {
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print(name + " 로 하시겠습니다? (네, 아니오) : ");
		String select = sc.nextLine();
		if (select.equals("네")) {
			play.setName(name);
			happyStart();
			
		} else if(select.equals("아니오")) {
			setName();
		} else {
			System.out.println("다시 입력해 주세요");
			setName();
		}
	}
	
	public void happyStart() {
		System.out.println("내 이름은 : " + play.getName() +"\n현재 모험을 하는 중이지" 
				+ "\n저기 작은 마을이 보이네 들어갈까? \n(들어간다 | 안들어간다) ");
		this.yes1 = sc.nextLine();
		if (yes1.equals("들어간다")) {
			System.out.println("어느 작은 마을에 도착했다.");
			scy.select();
		} else if (yes1.equals("안들어간다")) {
			System.out.println("미구현");
			happyStart();
		} else {
			System.out.println("다시 입력해주세요");
			happyStart();
		}
	}
	
}
