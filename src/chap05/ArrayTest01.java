package chap05;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayTest ( 배열 테스트 )
		
		int score = 100;
		double avg = 95.2;
		String str = "Korea";
		boolean flag = true;
		
		// 정수형 배열, [] 를 뒤에 붙여두 되나 앞에 붙이는게 눈에 띔
		int[] intArr = {10, 20, 30, 40, 50}; // 정수) 배열은 선언과 동시에 값을 초기화 해줘야함 (제일 쉬운방법)
		double[] doubleArr = {3.14, 5.2, 3.99, 0.2}; // 실수
		String[] strArr = {"Kor", "Jap","USA"}; // 문자
		boolean[] flagArr= {true, false, true, true}; // 잘 안쓰기인 하나 사용되긴함
		
//		intArr = {10, 20, 30, 40, 50}; 이후에 값을 나중에 넣게되면 에러
		
		// 배열에 크기만 지정하고, 기본값으로 초기화
		int[] intArr2 = new int[5]; // 4바이트짜리(정수) 방이 5개 만들어지는것, 비어있으면 안됨->0으로 초기화
		// int[] intArr2 = {0, 0, 0, 0, 0}; 과 같은 코드
		
		// index는 칸의 번호 ( 0부터 시작 ) / 보통 for문을 사용해서 뽑아옴, i++ 
		intArr2[0] = 100; // index 0번자리에 100을 넣는다
		intArr2[3] = 40;  // index 3번자리에 30을 넣는다;
		intArr2[4] = 60;  // index 4번자리에 40을 넣는다
		
		
		double[] doubleArr2 = new double[3];
		// double[] doubleArr2 = {0.0, 0.0, 0.0};
				
		boolean[] boolArr = new boolean[4]; // true가 아닌 false 저장되는 이유는 ture는 1 false는 0으로 치환됨
		// boolean[] boolArr = {false, false, false, false};
				
		String[] strArr2 = new String[3]; // null은 아무것도 없다 라는 뜨읏/ 기본값으로 초기화
		// String[] strArr2 = {null, null, null};
		
		// new 연산자를 사용하여, 배열 선언과 동시에 초기화
		int[] intArr3 = new int[] {1, 2, 3, 4, 5, 6};
		String[] strArr3 = new String[] {"aaa","bbb","ccc"};
		
		
		
		
		
		
	}

}
