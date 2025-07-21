package chap05;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// index    0  | 1  |  2 |  3 |  4   
		//numArr1  100 |200 |300 | 400| 500
		//numArr1[3] = 400;    이런 방식
		
		int[] numArr1 = {100, 200, 300, 400, 500};
		
		for(int i=0;i<5;i++) { // index 가 4까지밖에 없기때문에 i<5, 
			System.out.println(numArr1[i]); // numArr1 에있는 모든 원소 출력
		}
		
		
		System.out.println("=====================================");
		
		
		int sum = 0;
		for(int i=0;i<5;i++) {
			sum = sum+numArr1[i];
		 }//sum =  0 +  값 ;   
			// sum=sum+i 할 경우, i의 숫자 1~4까지 덧셈이 생기고
			// sum=sum+numArr1[i] 를 할경우 그 안에있는 원소 덧셈 
		
		    System.out.println(sum);
		
	}

}
