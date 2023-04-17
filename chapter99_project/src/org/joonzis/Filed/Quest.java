package org.joonzis.Filed;

import java.util.Random;
import java.util.Scanner;

public class Quest {
	FiledStart fs;
	Fight fight = new Fight();
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	
	
	public void quest() {
		ran.setSeed(System.currentTimeMillis());
		int num = ran.nextInt(10)+1;
		System.out.println("-------------------");
		fs = new FiledStart();
		if (num < 6) {
			fs.filedStart();
		} else if (num >= 6) {
			fight.fightStart();
		}
	}
}
