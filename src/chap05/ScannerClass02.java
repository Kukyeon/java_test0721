package chap05;

import java.util.Scanner;

public class ScannerClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	while(true) {	
		System.out.println("숫자를 입력(0입력시 종료)");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num == 0) {
			System.out.println("프로그램 종료");
			break;
		}
		
		if(num % 2 == 0) {
		System.out.println("짝");
		} else {
			System.out.println("홀");
		}
	}
		
	}

}
