package chap05;

import java.util.Scanner;

public class ScannerClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//   클래스     객체     
//		Scanner scanner = new Scanner(System.in);
//		
//		-------정수-------
//		System.out.println(" 당신이 제일 좋아하는 숫자를 입력하세요 : ");
//		int num1 = scanner.nextInt(); // 사용자로 부터 정수를 입력받아 정수 변수 num1에 저장
//		System.out.println("당신이 제일 좋아하는 숫자는"+ num1 + "입니다.");
//		scanner.close(); // 스캐너클래스는 사용 후에 닫아줘야함,int 사용하여 정수만가능
		
		
		//-------문자열-------, 정수,문자 두개를 같이 받을수도있음
		//while(true) < 를 넣게되면 무한반복
		//System.out.println(무한반복 종료하려면 나이칸에 0 을 입력하세요)
//		if(age == 0) {
//			System.out.println("종료합니다");
//			break; // 반복문에서 age에 0이 나올시 브레이크로 종료하게끔
//		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요 : ");
		String str = scanner.nextLine();//문자열 받기
		System.out.println("나이를 입력하세요 : ");
		int age = scanner.nextInt(); // 정수받기
		
		
		
		
		System.out.println("이름 : "+str);
		System.out.println("나이 : "+age);
	}

}
