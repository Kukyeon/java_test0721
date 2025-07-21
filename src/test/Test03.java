package test;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		3. 1부터 100까지 홀수 합 출력
//		1부터 100까지의 수 중 홀수의 합을 출력하세요.
		
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++ ) {
			if ( i % 3 == 0)   {
				sum += i;
				System.out.println("sum의 값 : " + sum);
			}
			 
			
		}
		
		
		
	}

}
