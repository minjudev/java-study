package ex13.control2.continue_break;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 space로 구분해서 5개 이상 입력하세요 : ");
		
		// 3 Enter,  34 5 6 234 345 54 45 Enter
		
		// 사용자가 Enter를 입력할 때까지 반복
		// scan.hasNext() 함수는 다음에 읽어올 값의 유무(boolean) 판단 가능
		while(scan.hasNext()) {
			n = scan.nextInt(); 
			
			// 10보다 작은 값은 건너뛰기
			if(n < 10)
				continue;
			
			// 300보다 큰 값이 나오면 종료하기
			if(n > 300)
				break;
			
			System.out.println(n);
		}
	}
}