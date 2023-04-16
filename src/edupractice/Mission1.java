package edupractice;

public class Mission1 {

	public static void main(String[] args) {
		
		//총계 짝수, 홀수 합을 구하는 변수 선언하기
		int totalsum = 0;
		int oddsum = 0;
		int evensum = 0;
		
		//1~1000까지의 수 불러오기
		for(int i = 0; i < 1001; i++) {
			//짝수의 합 구하기
			if( (i % 2) == 0 ) {
				oddsum += i;
				//홀수의 합
			} else {
				evensum += i;
			}		
		}		
		System.out.println("총계: " + (oddsum + evensum));
		System.out.println("짝수의 합: " + evensum);
		System.out.println("홀수의 합: " + oddsum);
	}

}
