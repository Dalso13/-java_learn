package org.joonzis.Filed;

import java.util.Random;
import java.util.Scanner;

import org.joonzis.status.PlayerStatus;
import org.joonzis.status.Slime;

public class Fight {
	Scanner sc = new Scanner(System.in);
	private Random ran = new Random();
	PlayerStatus player = new PlayerStatus();
	Slime slime = new Slime();
	FiledStart filedStart;
	private int select;
	
	public void fightStart() {
		System.out.println(slime.getName() + " 와(과) 마주쳤다.\n어떻게 해야할까?");
		System.out.println("1. 싸운다\t2. 도망친다");
		int select = sc.nextInt();
		if (select == 1) {
			System.out.println("--------------");
			fightGo();
		} else if (select == 2) {
			ran.setSeed(System.currentTimeMillis());
			int num = ran.nextInt(10)+1;
			if (num >= 6) {
				System.out.println("----------------------" + "\n----------------------\n");
				System.out.println("무사히 도망쳤다");
				System.out.println("----------------------" + "\n----------------------\n");
				filedStart = new FiledStart();
				filedStart.filedStart();
			} else {
				System.out.println("----------------------" + "\n----------------------\n");
				System.out.println("도망치는데 실패하였다!");
				System.out.println("----------------------" + "\n----------------------\n");
				fightGo();
			}
		} else {
			System.out.println("----------------------" + "\n----------------------\n");
			System.out.println("다시 입력해 주세요.");
			System.out.println("----------------------" + "\n----------------------\n");
			fightStart();
		}
	}
	
	public void fightGo() {
		System.out.println("\n어떤 행동을 해야할까?\n");
		System.out.print("1. 공격\t2.방어");
		this.select = sc.nextInt();
		System.out.println("----------------------" + "\n----------------------\n");
		if (select == 1) {
			System.out.println("기본 공격을 시도하였다!.");
			if (player.getAttakPro() >= 3) {
				int slimeHp = slime.getHp1() - player.getAttak();
				slime.setHp1(slimeHp);
				System.out.println(player.getAttak() + " 데미지가 들어갔다!.");
			} else if (player.getAttakPro() < 3) {
				System.out.println("명중 실패!");
			}
		}
		if (slime.getHp1() <= 0) {
			System.out.println("----------------------" + "\n----------------------\n");
			System.out.println("슬라임을 물리쳤다!");
			System.out.println(slime.getSlimeExp() + "Exp 획득!");
			player.setExp(slime.getSlimeExp());
			System.out.println("밖으로 나갑니다.");
			System.out.println("----------------------" + "\n----------------------\n");
			slime.setHp1(slime.nevetGetHp1());
			filedStart = new FiledStart();
			filedStart.filedStart();
		}
		slimeFight();
		
	} 
	
	
	public void slimeFight() {
		System.out.println("----------------------" + "\n----------------------\n");
		System.out.println("슬라임의 공격 차례이다!");
		System.out.println("----------------------" + "\n----------------------\n");
		ran.setSeed(System.currentTimeMillis());
		int slimeSelect = ran.nextInt(10)+1;
		System.out.println("슬라임이 강력한 공격을 한다!");
		if (slime.getSlimeAttak_pro() > 3) {
			if (select == 2) {
				int playerHp = player.getHp() + player.getTank() - slime.getSlimeAttak() ;
				player.setHp(playerHp);
				System.out.println((slime.getSlimeAttak() - player.getTank())  + " 데미지가 들어왔다!.");
			} else {
				int playerHp = player.getHp() - slime.getSlimeAttak();
				player.setHp(playerHp);
				System.out.println("----------------------" + "\n----------------------\n");
				System.out.println(slime.getSlimeAttak() + " 데미지가 들어왔다다!.");
				System.out.println("----------------------" + "\n----------------------\n");
			}
			
		} else if (slime.getSlimeAttak_pro() <= 3) {
			System.out.println("빗나갔다! 다행이야");
		}
		if (player.getHp() <= 0) {
			System.out.println("----------------------" + "\n----------------------\n");
			System.out.println("전투에서 패배했어!");
			System.out.println("u die");
			sc.close();
			System.exit(0);
			
		}
		fightGo();
		
	}

	
}
