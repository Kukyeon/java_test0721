package chap05;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] intArr = {10, 20, 30, 40, 50};
		
	//	System.out.println(intArr[5]); // 5번방이 없기에 출력안됨..범위 벗어남 / 0부터~ 4까지 존재 
		
		//intArr[5] = 300;  5번방이 없기에 출력안됨..범위 벗어남 / 0부터~ 4까지 존재 
		//System.out.println(intArr[5]); 5번방이 없기에 출력안됨..범위 벗어남 / 0부터~ 4까지 존재 
		
//		for(int i=0 ; i<=5 ; i++) { 부등호 빼야함
//			System.out.println(intArr[i]); // 5번방이 없기에 출력안됨..범위 벗어남 / 0부터~ 4까지 존재 
//		}
		String str1 = "Kor";
		System.out.println(str1 + 7777); //출력결과 -> 문자열로 바뀌어서 출력
		
		String[] strArr = {"Kor", "Jap", "USA"};
		System.out.println(strArr[1] + 7777);
		
		
		String[] strArr2 = new String[5];
		System.out.println(strArr2[1]); // 출력결과 0> 문자열로 바뀌어서 출력( null )
		
		
		int[] intArr2 = {60, 70, 80, 90, 100,15,15,15,15,15,15,15,15,15,15,1,2,2,2,2,2,2,2,2,5,1,1,1,1,3,3,5,5,48,8,4,4,4,4}; // 배열 5개, index 는 0~4 
		System.out.println(intArr2.length); // 배열 요소의 갯수를 반환해준다>> .length <<
		
		
		int arrLength = intArr2.length;  // 배열요소 갯수를 이런식으로 활용도 가능
		for(int i=0 ; i<intArr2.length ; i++) {
			System.out.println(intArr2[i]);
		}
		
	}

}
