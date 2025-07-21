package Ex_0721;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		6. 1부터 100까지 합 구하다가 합이 100 이상이면 멈추기
//		1부터 100까지 더하다가 합이 100 이상이 되면 멈추고, 마지막으로 더한 수와 합을 출력하세요.
		
		
		int sum=0;
		int lastnumber = 0;
		for(int i=0 ; i <=100 ; i++) {
			sum = sum+i;
			if(sum >= 100) {
				lastnumber = i;
				break;
			}
			
		}
		System.out.println("합 :"+ lastnumber);
		System.out.println("합 :"+ sum);
	}       
	         
}
