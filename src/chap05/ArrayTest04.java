package chap05;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2차원 배열
		
		int[][] arr = new int[4][3]; // 4행3열 2차원 배열 선언 및 초기화
		
		System.out.println(arr[0][0]); 
		
		int[][] arr2 = {{10,20},
						{30,40},
						{50,60} // 이러면 보기편함
						}; // 2차원 배열 선언과 동시에 특정값으로 초기화
		
	
		System.out.println(arr2[2][1]); // 2행 1열 = 60 값 배출
		
		
		System.out.println("--------------------");
		  
		  
		  
		// 2중 for문을 사용해서 2차원 배열의 모든 원소를 출력
		
		for(int i=0 ; i<arr2.length ; i++) {
			for(int j=0 ; j<arr2[i].length ; j++) {
				
			System.out.println(arr2[i][j]);
				
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
}
