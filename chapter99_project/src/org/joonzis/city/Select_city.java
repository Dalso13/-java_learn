package org.joonzis.city;

import java.util.Scanner;

import org.joonzis.Filed.FiledStart;
import org.joonzis.name.Player;
import org.joonzis.name.StatusWindow;

public class Select_city{
	private Motel motel = new Motel(); 
	private Shop shop = new Shop();
	private FiledStart filedStart = new FiledStart();
	private Scanner sc = new Scanner(System.in);
	private StatusWindow stat = new StatusWindow();
	private int move;
	
	
	public void select() {
		System.out.println("이제 무엇을 할까?" + "\n1. 여관 가기\t2.상점 가기\t3.필드로 가기\t4.상태창 열기" + "\n(1,2,3,4)");
		this.move = sc.nextInt();
		if (move == 1) {
			motel.motel_life();
		} else if (move == 2) {
			shop.shop();
		} else if (move == 3) {
			System.out.println("당신은 마을을 떠나 몬스터가 있는 필드로 들어왔다.");
			filedStart.filedStart();
		} else if (move == 4) {
			stat.statusWindow();
		} else  {
			System.out.println("다시 입력해 주세요");
			select();
		}
	}

}
