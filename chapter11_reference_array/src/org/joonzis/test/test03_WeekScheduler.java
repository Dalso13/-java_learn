package org.joonzis.test;

import java.util.Scanner;

public class test03_WeekScheduler {
	test03_Day[] days;
	String[] week;
	Scanner sc = new Scanner(System.in);

	public test03_WeekScheduler(String[] week) {
		this.week = week;
	void menu() {
		System.out.print("1. 스케줄 생성, 2. 삭제, 3. 수정, 4. 보기, 0. 종료 : ");
		int menu = sc.nextInt(); 
		switch (menu) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3	
		
			break;
		case 4	
		
			break;
		case 5	
		
			break;
		}
	}
	void makeSchedule() {
		
	}
	void removeSchedule() {
		
	}
	 void modifySchedule() {
		 
	 }
	 void  output() {
		 
	 }
	
	 void exit() {
		 System.out.println("종료 되었습니다.");
	 }
	 void run() {
		 menu();
	 }
 }