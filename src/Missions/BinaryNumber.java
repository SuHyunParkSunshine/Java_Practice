package Missions;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {

		int num = 0;
		int remainder = 0;
		int arr[] = new int[32];

		// 숫자를 입력 받음

		Scanner sr = new Scanner(System.in);
		System.out.println("숫자를 입력해 보거라~!");
		num = sr.nextInt();

		// num을 계속 2로 나누어진 나머지를 출력하는 것을 만들어야지

		while (num != 0) { // num==0 0이면 멈추고 num!=0 0이 아니면 계속 돌아감

			// 2로 나눈 나머지 출력
			arr[remainder] = num % 2;

			// 증감식?
			remainder++;
			num = num / 2;
		}

		for (int i = (remainder - 1); i >= 0; i--) {
			System.out.print(arr[i]);
		}
		sr.close();
	}

}