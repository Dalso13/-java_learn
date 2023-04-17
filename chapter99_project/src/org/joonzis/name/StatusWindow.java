package org.joonzis.name;

import java.util.Scanner;

import org.joonzis.city.Select_city;
import org.joonzis.status.PlayerStatus;

public class StatusWindow{
	Select_city city;
	Scanner sc = new Scanner(System.in);
	PlayerStatus player = new PlayerStatus();
	public void statusWindow() {
		System.out.println("----------------------" + "\n----------------------\n");
		System.out.println("1. 상태창 보기\t2. 창 끄기\t3. 게임종료");
		int select = sc.nextInt();
		System.out.println("\n----------------------" + "\n----------------------\n");
		if (select == 1) {
			player.stat();
			System.out.println("\n----------------------" + "\n----------------------\n");
			statusWindow();
		} else if (select == 2) {
			city = new Select_city();
			city.select();
			
		} else if (select == 3) {
			System.out.println("종료 했습니다.");
			System.exit(0);
		}
	}
}
