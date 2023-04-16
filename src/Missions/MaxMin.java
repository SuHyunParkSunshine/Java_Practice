package Missions;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {

		int remainder = 0;
//		int quotient = 0; //몫
		int max = 0;
		int min = 0;

		Scanner sr = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하시오");
		int fnum = sr.nextInt(); // 처음 정수
		int snum = sr.nextInt(); // 두번째 정수

		// 최대공약수 구하기
		if (fnum > snum) {

			remainder = fnum % snum;

			while (remainder > 0) {
				max = remainder;

				remainder = snum % remainder;
			}
			min = max * (fnum / max) * (snum / max);
		}
		else {
			remainder = snum % fnum;

			while (remainder > 0) {
				max = remainder;

				remainder = fnum % remainder;
			}
			min = max * (fnum / max) * (snum / max);
		}
		System.out.println("입력: " + fnum + "," + snum);
		System.out.println("최대공약수 : " + max);
		System.out.println("최소공배수 : " + min);
		sr.close();
	}
}
