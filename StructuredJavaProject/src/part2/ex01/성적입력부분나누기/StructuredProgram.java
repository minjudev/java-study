package part2.ex01.성적입력부분나누기;

import java.util.Scanner;

public class StructuredProgram {
	
	// 전역변수를 통해 함수 2개가 자원을 공유할 수 있음
	// 전역변수를 만들기 위해서는 반드시 앞에 static을 작성해줘야 함
	// static int[] korList = new int[3];
	
    public static void main(String[] args) {
    	
    	int[] korList = new int[3];
    	
        int menu;
        boolean keepLoop = true;			
				
		while(keepLoop) {
			
			menu = inputMenu();
	        
	        switch(menu) {	        
	        case 1:	      
	        	// int[] korList에 해당되는 참조(new int[3]의 주소)가 아래 매개변수(korList)로 전달됨 
	        	inputKors(korList);  
		        break;		        
	        case 2:		        
		        printKors(korList);	        	
		        break;		        
	        case 3:
	        	System.out.println("Good bye :)");
	        	
	        	keepLoop = false;
				break;	        
	        default:
	        	System.out.println("잘못된 값을 입력하였습니다. 메뉴는 1~3까지입니다.");	       
	
	        }
	        
		}
    }
    
    static int inputMenu() {
		Scanner scan = new Scanner(System.in);
    	    	
    	System.out.println("┌───────────────────────────┐");
        System.out.println("│           메인 메뉴          │");
        System.out.println("└───────────────────────────┘");
        System.out.println("\t1. 성적 입력 ");
        System.out.println("\t2. 성적 출력 ");
        System.out.println("\t3. 종료 ");
        System.out.print("\t선택> ");
        int menu = scan.nextInt();

        return menu;
    }
    
    // 매개변수를 어떤 이름으로 쓸 것인가는 이 지역 내에서 정하는 것이므로 매개변수를 전달받을 때는 변수명을 새로 생성해도 됨
    static void inputKors(int[] kors) {
    	
    	// 굳이 공유할 필요가 없는 코드는 해당 함수에도 동일한 코드를 작성해주면 됨
		Scanner scan = new Scanner(System.in);
    	int kor;
		
    	System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  입력         │");
        System.out.println("└───────────────────────────┘");
        System.out.println();
       		        
        for(int i=0; i<3; i++) {
	        do {
		        System.out.printf("국어 %d: ", i+1);
		        kor = scan.nextInt();
	        
		        if(kor < 0 || 100 < kor)
		        	System.out.println("국어 성적은 0~100까지의 범위만 입력이 가능합니다.");
		        
	        } while(kor < 0 || 100 < kor);
        
        	kors[i] = kor;
        }
        
        System.out.println("─────────────────────────────");
    }

    static void printKors(int[] kors) {
    	
        int total = 0;
        float avg;
    	
    	for(int i=0; i<3; i++)
        	total += kors[i];
        
        avg = total / 3.0f;
        
        System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  출력         │");
        System.out.println("└───────────────────────────┘");
        System.out.println();		        
       
        for(int i=0; i<3; i++)
        	System.out.printf("국어 %d: %3d\n", i+1, kors[i]);	        	
        	        
        System.out.printf("총점 : %3d\n", total);
        System.out.printf("평균 : %6.2f\n", avg);
        System.out.println("─────────────────────────────");
    }
} 
