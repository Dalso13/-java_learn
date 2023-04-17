package org.joonzis.status;

import java.util.Random;

public class PlayerStatus{
	Random ran = new Random();
	private String name;
	private int hp;
	private int mp;
	private int exp;
	private int level;
	private int attak;
	private int attak_pro;
	private int tank;
	
	public PlayerStatus() {
		this.hp = 250;
		this.mp = 50;
		this.exp = 0;
		this.level = 1;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		int count = level*25;
		this.hp = hp+count;
	}


	public int getMp() {
		return mp;
	}



	public void setMp(int mp) {
		int count = level*10;
		this.mp = mp-count;
	}




	public int getExp() {
		return exp;
	}



	public void setExp(int exp) {
		this.exp += exp;
		
		if (this.exp >= (50*level)) {
			level += 1;
			this.exp -= (50*level);
			System.out.println("레벨업!");
		}
		
	}



	public int getLevel() {
		return level;
	}

	public void setAttak() {
		int count = (this.level)*5;

		this.attak = ran.nextInt(50+count)+30;
	}

	public int getAttak() {
		int count = (this.level)*5;
		ran.setSeed(System.currentTimeMillis());
		return this.attak = ran.nextInt(50+count)+30;
	}

	public int getAttakPro() {
		ran.setSeed(System.currentTimeMillis());
		return this.attak_pro = ran.nextInt(10)+1;
	}
	
	public int getTank() {
		int count = (this.level)*3;
		ran.setSeed(System.currentTimeMillis());
		return tank = ran.nextInt(30+count)+10;
	}
	


	public void stat() {
		System.out.println("HP : " + getHp());
		System.out.println("MP : " + getMp());
		System.out.println("Exp : " + getExp());
		System.out.println("Level : " + getLevel());
		
	}
	
}
