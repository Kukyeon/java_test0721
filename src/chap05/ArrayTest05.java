package chap05;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 향상된 for 문
		
		int[] arr = {10, 20, 30, 40, 50};
		
		//모든 배열 요소를 출력하는 for문 작성 전환전
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========================");
		// 향상된 for문으로 전환
		
		for( int num : arr) { // 배열 요소를 차례대로 나열
			System.out.println(num);
		}
		
		// 다음 배열의 모든 요소 중 짝수만 출력하시오
		
		
		
	}

}
