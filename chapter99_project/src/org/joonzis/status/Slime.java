package org.joonzis.status;

import java.util.Random;

public class Slime {
	private String name1;
	private int hp1;
	private int level1;
	private int slimeAttak;
	private Random ran = new Random();
	private int slimeAttak_pro;
	private int slimeTank;
	private int slimeExp;
	
	public Slime() {
		this.name1 = "슬라임";
		this.hp1 = 150;
		this.level1 = 1;
	}

	public int nevetGetHp1() {
		return 200;
	}
	
	public void setHp1(int hp1) {
		int count = level1*25;
		this.hp1 = hp1+count ;
	}
	
	public int getHp1() {
		return hp1;
	}

	
	public String getName() {
		return name1;
	}
	
	public int getSlimeAttak() {
		int count = (this.level1)*5;
		ran.setSeed(System.currentTimeMillis());
		return this.slimeAttak = ran.nextInt(40+count)+25;
	}
	
	public int getSlimeAttak_pro() {
		ran.setSeed(System.currentTimeMillis());
		return slimeAttak_pro = ran.nextInt(10)+1;
	}
	
	public int getSlimeExp() {
		return 30 + 20*level1;
 	}
	
	
	
	// 슬라임 방어
//	public int getSlimeTank() {
//		int count = (this.level1)*3;
//		ran.setSeed(System.currentTimeMillis());
//		return slimeTank = ran.nextInt(30+count)+10;
//	}
//	
}
