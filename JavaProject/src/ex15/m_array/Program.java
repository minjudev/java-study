package ex15.m_array;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		// int kor1, kor2, kor3;
		int[] kors = new int[3*3];
		int total;
		float avg;
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		/*
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		*/
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<3*3; i++) {
				// 1차원이지만 개념상으로는 2차원으로 생각하고 다룰 수 있음
				kors[3*j+i] = 0;
			}
		}
	      
		// "종료"라는 라벨 이용해서 while문에서 벗어나기
	    종료: 
	    while(true) {    	  
			// -------------- 메인 메뉴 부분 ---------------
		    System.out.println("┌──────────────────┐");
		    System.out.println("│      메인 메뉴      │");
		    System.out.println("└──────────────────┘");
		    System.out.println("\t1. 성적 입력");
		    System.out.println("\t2. 성적 출력");
		    System.out.println("\t3. 종료");
		    System.out.print("\t>");
		    menu = scan.nextInt();
		        
		    switch(menu) {
		    
		    case 1: 
		    	
				// -------------- 성적 입력 부분 ---------------
				System.out.println("┌──────────────────┐");
				System.out.println("│      성적 입력     │");
				System.out.println("└──────────────────┘");
		     
				/*
				do {
			        System.out.print("국어1: ");
			        kor1 = scan.nextInt();
			        
			        if(kor1 < 0 || 100 < kor1) {
			           System.out.println("성적 범위(0 ~ 100)를 벗어났습니다");
			        }
			     } while (kor1 < 0 || 100 < kor1); // while 구문의 조건이 참이면 다시 do 코드로 돌아감
			     
			     do {
			        System.out.print("국어2: ");
			        kor2 = scan.nextInt();
			        
			        if(kor2 < 0 || 100 < kor2) {
			           System.out.println("성적 범위(0 ~ 100)를 벗어났습니다");
			        }
			     } while(kor2 < 0 || 100 < kor2);
			     
			     do {
			        System.out.print("국어3: ");
			        kor3 = scan.nextInt();
			        
			        if(kor3 < 0 || 100 < kor3) {
			           System.out.println("성적 범위(0 ~ 100)를 벗어났습니다");
			        }
			     } while(kor3 < 0 || 100 < kor3);
			     */
			     
				 for(int j=0; j<3; j++) {
				     for(int i=0; i<3; i++) { 
					     do {
						        System.out.printf("%d학년 국어%d: ",j+1, i+1);
						        kors[3*j+i] = scan.nextInt();
						        
						        if(kors[3*j+i] < 0 || 100 < kors[3*j+i]) {
						           System.out.println("성적 범위(0 ~ 100)를 벗어났습니다");
						        }
						 } while(kors[3*j+i] < 0 || 100 < kors[3*j+i]);
				     }
				 }
	         
			     break;
			     
		    case 2: 
		    	
			     // -------------- 성적 출력 부분 ---------------
		    	
				 // total = (kor1 + kor2 + kor3);
				 // total = kors[0] + kors[1] + kors[2];
		    	
		    	 // 1. 국어 성적을 반복해서 입력받는다. 
		    	 // 2. 국어 성적을 반복해서 출력한다.
		    	
		    	 for(int j=0; j<3; j++) {
			    	 for(int i=0; i<3; i++) {
			    		 System.out.printf("<%d학년 국어 성적>---------", j+1);
			    		 System.out.printf("\t국어%d : %3d\n", i+1, kors[3*j+i]);
			    	 }
		    	 }
		    	 
		    	 
		    	
				 avg = total / 3.0f;
			
				 System.out.println("┌──────────────────┐");
				 System.out.println("│      성적 출력      │");
				 System.out.println("└──────────────────┘");
					
				 for(int i=0; i<3; i++) {
					 System.out.printf("\t국어%d : %3d\n", i+1, kors[i]);		
				 }
				
				 System.out.printf("\t총점 : %3d\n", total);
				 System.out.printf("\t평균 : %6.2f\n", avg);
				 System.out.println("────────────────────");
				 
				 // switch문만 벗어나는 break
				 break;
				 
		    case 3: 
	        	 // switch문 안에서 break를 만나면 현재 코드 상 while문에서 벗어나지 못하고 switch문에서만 벗어남
	        	 // "종료"라는 라벨 이용해서 while문에서 벗어나기
		    	 break 종료;
	        	 
	        // switch문에서 default는 if else문의 else에 해당 
		    default:
	        	 System.out.println("입력 오류");
	         
		    }
		 }
	    
	     System.out.println("good bye!");
	}
}