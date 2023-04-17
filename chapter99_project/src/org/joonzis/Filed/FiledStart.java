package org.joonzis.Filed;

import java.util.Scanner;

import org.joonzis.city.Select_city;

public class FiledStart {
	private Scanner sc = new Scanner(System.in);
	 Quest quest = new Quest();
	 Select_city secy;
	private static int count = 1;
	public void filedStart() {
		System.out.println("광활한 평야" + (count));
		System.out.print("1.나아간다\t2.숙영\t3.마을로 돌아간다.\n(1,2,3)");
		int select = sc.nextInt();
		secy = new Select_city();
		
		if (select == 1) {
			count++;
			quest.quest();
		} else if (select == 2) {
			System.out.println("미구현");
		} else if (select == 3) {
			System.out.println("왔던 길로 최대한 빨리 돌아갔다.");
			secy.select();
		} else {
			System.out.println("다시 선택해 주세요.");
			filedStart();
		}
	}
}
