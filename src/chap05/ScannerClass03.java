package chap05;

import java.util.Scanner;

public class ScannerClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int comNumber = (int)((Math.random() * 100 ) + 1); // 랜덤으로 컴퓨터가 생각한 수를 생성
//		System.out.println(comNumber);
		
		
		System.out.println("숫자 맞추기");
		System.out.println(" 1 부터 100 사이에 숫자를 맞춰 보기 ");
		
		int count = 0; // 횟수 추가
		
		while(true) {
			
			count++;
			
			System.out.println(" 1 부터 100 사이에 숫자를 맞춰 보기 ( 0 입력시 종료 ) : ");
			
			
			int usernum = scanner.nextInt(); // 사용자 입력 숫자
			if(usernum == 0) break;
			if(usernum > comNumber) {
				System.out.println("당신의 숫자가 더 큽니다.");
			}else if(usernum < comNumber) {
				System.out.println("당신의 숫자가 더 작습니다. ");
			} else {
				System.out.println("숫자가 같습니다."+count+"회 사용");
				break;
			} 
			
			
			
			
			
		}
		
	}

}
