package Ex_0721;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		7. 1부터 100까지 홀수는 더하고 짝수는 빼기
//		1부터 100까지 숫자를 홀수는 더하고 짝수는 빼서 결과를 출력하세요.
//		예: n=5 → 1 - 2 + 3 - 4 + 5 = 3
		
		
		int sum=0;
		
		for(int i=0;i<=100;i++) {
			if(i % 2 == 1) {
				sum = sum+i;
			}else {
				sum=sum - i;
			}
		}
		
		System.out.println("합 :"+ sum);
	}

}
