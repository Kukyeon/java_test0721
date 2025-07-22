package Ex_0721;

public class Array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.다음 값 들의 평균을 계산하여 출력하시오.
		//ex)90,80,70,100,85
		int sum = 0;
		int[] arr1 = {90,80,70,100,85};
		// arr1을 num에 한개씩 대입하면서 sum+num으로 누적
		for(int num : arr1) { //향상된 for문
			sum = sum+num;
				}System.out.println(sum/arr1.length);
				// arr1.length 는 0부터4까지 총 5개 이기때문에, 실수까지 보려면 5.0 이나 앞에 강제형변환으로 (double) 포함
	System.out.println("====================================");	
	
	//2.다음 숫자들을 거꾸로 출력하시오. ex)50 40 30 20 10
		
	int[] arr2 = {50, 40, 30, 20, 10};
	for (int i = arr2.length - 1; i >= 0; i--) {
		//arr2.length는 0부터4까지 총 5개 이지만 4부터 출력해야하기에 -1 그리고 0까지 출력
		System.out.println(arr2[i]);
	}  
	System.out.println("====================================");	
	
	//3.다음 숫자열에서 3의 갯수가 몇개 인지 출력하시오.
	// 1.3.7.3.3.5.3.6.9.3.3.3
	 	int count = 0;
		int[] numarr = {1,3,7,3,3,5,3,6,9,3,3,3};
			for(int i=0 ; i < numarr.length ; i++) { // for(int i : numarr) 로도 가능 향상된 for문
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
	 	for (int h = 0 ; h < day.length ; h++) { // for(int home : day) 가능
	 		home = home * day[h];
	 	}         System.out.println(home);
	 	System.out.println("====================================");	
	 		
	 	
	 	
		
		
		
		
		
		
		
	
	}
	}


