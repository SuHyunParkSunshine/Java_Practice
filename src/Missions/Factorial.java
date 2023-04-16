package Missions;

import java.util.Scanner;

public class Factorial {
	
	

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		System.out.println("숫자를 입력하시여~!");
		int num = sr.nextInt();

		int fac = num;
		int result = 1;

		while (fac > 1) {
			result = result * fac;
			System.out.print(fac + "*");
			fac--;
		}
		System.out.println(1);
//		for (int i = num; i != 0; i--) {
//			System.out.println(i);		
//		}
		System.out.println("입력: " + num + " -> " + num + "!" + " = " + result);
		sr.close();
	}

}
