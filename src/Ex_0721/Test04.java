package Ex_0721;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		4. 1부터 100까지 짝수와 홀수 개수 세기
//		1부터 100까지의 수 중 홀수 개수와 짝수 개수를 출력하세요.
		
		int evencount = 0;
		int oddcount = 0;
		
		
		for(int i=0; i<=100 ; i++) {
			if(i % 2 == 0) { //짝수 찾기
				evencount++;
			
			}else { // 홀수찾기
				oddcount++;
	} 
		
	}
			System.out.println("짝수 "+ evencount);
			System.out.println("홀수 "+ oddcount);
		
	}

}
