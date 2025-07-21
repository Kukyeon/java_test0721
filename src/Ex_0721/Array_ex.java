package Ex_0721;

public class Array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.다음 값 들의 평균을 계산하여 출력하시오.
		//ex)90,80,70,100,85
		int sum = 0;
		int[] arr1 = {90,80,70,100,85};
		
		for(int num : arr1) {
			sum = sum+num;
				}System.out.println(sum/arr1.length);
	
	System.out.println("====================================");	
	
	//2.다음 숫자들을 거꾸로 출력하시오. ex)50 40 30 20 10
		
	int[] arr2 = {50, 40, 30, 20, 10};
	for (int i = arr2.length - 1; i >= 0; i--) {
		System.out.println(arr2[i]);
	}
	System.out.println("====================================");	
	
	//3.다음 숫자열에서 3의 갯수가 몇개 인지 출력하시오.
	// 1.3.7.3.3.5.3.6.9.3.3.3
	 	int count = 0;
		int[] numarr = {1,3,7,3,3,5,3,6,9,3,3,3};
			for(int i=0 ; i < numarr.length ; i++) {
				if(numarr[i] == 3) count++;
			} System.out.println(count);
		
	System.out.println("====================================");	
	//4.아래 배열에서 홀수 인덱스의 값만 출력하시오./ 10,20,30,40,50
	
		int[] array = {10,20,30,40,50};
		for(int i=0 ; i < array.length ; i++)
			if(i % 2 == 1) {
				System.out.println(array[i]);
			}
	
	
	System.out.println("====================================");	
	//5.아래 숫자들을 모두 곱한 값을 배열을 사용하여 출력하시오.
	// 1.2.3.4.5
		
	 int[] day = {1,2,3,4,6};
	 int home = 1;
	 	for (int h = 0 ; h < day.length ; h++) {
	 		home = home * day[h];
	 	}         System.out.println(home);
	 	System.out.println("====================================");	
	 		
	 	
	 	
		
		
		
		
		
		
		
	
	}
	}


