package Missions;

import java.util.Scanner;

public class Test {
	
	public static int factorial(int value) {
		if (value == 1) {
			return 1;
		}
		else {
			return value*factorial(value-1);
		}
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("숫자를 입력해 보거라~!");		
		int num = sr.nextInt();	
		
		System.out.println(num + "! = " + factorial(num));
	
		sr.close();
	}

}
