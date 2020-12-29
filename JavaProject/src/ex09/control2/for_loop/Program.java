package ex09.control2.for_loop;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(true) {
			// -------------- 성 적 입력 부분 ---------------
			System.out.println("┌──────────────────┐");
			System.out.println("│      성적 입력     │");
			System.out.println("└──────────────────┘");
			System.out.print("국어1: ");
			kor1 = scan.nextInt();
			
			//if (!(0 <= kor1 && kor1 <= 100)) 
			//if (0 > kor1 || kor1 > 100) 
			while (kor1 < 0 || 100 < kor1) {
				System.out.println("성적 범위(0 ~ 100)를 벗어났습니다");
				
				System.out.print("국어1: ");
				kor1 = scan.nextInt();
			}
			
			System.out.print("국어2: ");
			kor2 = scan.nextInt();
			System.out.print("국어3: ");
			kor3 = scan.nextInt();
	
			// -------------- 성적 출력 부분 ---------------
			total = (kor1 + kor2 + kor3);
			avg = total / 3.0f;
	
			System.out.println("┌──────────────────┐");
			System.out.println("│      성적 출력     │");
			System.out.println("└──────────────────┘");
				
			// i의 초기화 값은 0으로 고정하는 게 좋음
			// i(index): 0~
			// n(number): 1~
			// for(int n=1; n<=3, n++)
			for(int i=0; i<3; i++) {
				System.out.printf("\t국어%d : %3d\n", i+1, kor1);		
			}
			
			// 3, 2, 1을 출력하는 반복문 
			// 내 코드
//			for(int i=3; i>=1; i--) {
//				System.out.printf("\t국어%d : %3d\n", i, kor1);		
//			}
			
			// 수정한 코드
//			for(int i=0; i<3; i++) {
//				System.out.printf("\t국어%d : %3d\n", 3-i, kor1);
//			}
			
			System.out.printf("\t총점 : %3d\n", total);
			System.out.printf("\t평균 : %6.2f\n", avg);
			System.out.println("────────────────────");
		}
		
	}
}