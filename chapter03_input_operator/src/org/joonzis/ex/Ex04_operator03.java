package org.joonzis.ex;

public class Ex04_operator03 {
	public static void main(String[] args) {
		
		
		
		int a = 10;
		System.out.println(a == 10 && a < 100); //true
		System.out.println( a != 10 || a == 10); // true
		System.out.println(!(a==10)); //false
		
		
		int b = 10;
		b++;
		boolean result = (a == 100) && (b > 10); //false
		System.out.println("result : " + result + ", b : " + b); //false : 11
		
		
		int age = 18;
		boolean isAdult = (age >= 20) ? true : false;
		String isAdultStr = (age >= 20) ? "성인" : "미성년";
		int fee = isAdult ? 4000 : 2000;
		System.out.println("요금 : " + fee);
		System.out.println( age >= 20 ? 4000 : 2000);
		
		String id = "admin";
		
		String clear = (id.equals("admin")) ? "인증성공" : "인증실패";
	    	System.out.println(clear);
	
		
	}
}
