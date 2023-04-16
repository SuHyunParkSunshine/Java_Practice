//edupractice 패키지 선언
package edupractice; 

class CalcSumSub {
	// 필드 변수 선언
	private int totalsum; // 전체 합 변수
	private int oddsum; // 홀수 합 변수
	private int evensum; // 짝수 합 변수
	
	// 생성자 정의
	public CalcSumSub(int num) {
		// 0부터 num까지 반복하며 합을 계산
		for(int i = 1; i <= num; i++) { 
			if(i%2==0) evensum += i; // 짝수면 짝수 합에 더하기
			else oddsum += i; // 홀수면 홀수 합에 더하기			
		}
		// 전체 합 계산
		totalsum = evensum + oddsum;
	}
	// Getter 메서드 정의
	public int getTotalsum() {return totalsum; } // 전체 합 반환
	public int getOddsum() {return oddsum; } // 홀수 합 반환
	public int getEvensum() {return evensum; }	// 짝수 합 반환
}

public class CalcSum {
	// main 메서드 시작
	public static void main(String[] args) {
		
		// 명령행 매개변수로 입력받은 숫자를 int 타입으로 변환하여 저장
		int arg = Integer.parseInt(args[0]);
		// CalcSumSub 클래스의 객체 생성
		CalcSumSub cs = new CalcSumSub(arg);
		
		// 결과 출력
		System.out.println("총계: " + cs.getTotalsum()); // 전체 합 출력
		System.out.println("홀수의 합 " + cs.getOddsum()); // 홀수 합 출력
		System.out.println("짝수의 합: " + cs.getEvensum()); // 짝수 합 출력
	}
}
