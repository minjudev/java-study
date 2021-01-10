package part2.ex02.TopDown;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while(running) {
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				lottos = createAutoLottos();
				break;
			case 2:
				lottos = createManualLottos();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			default:
			}
		}
		
	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌────────────────────────────┐");
        System.out.println("│       Lotto 관리 프로그램      │");
        System.out.println("└────────────────────────────┘");
        System.out.println("\t1. 번호 자동 생성");
        System.out.println("\t2. 번호 수동 생성");
        System.out.println("\t3. 내 로또 번호 보기");
        System.out.println("\t4. 종료");
        System.out.print("\t> ");
		
        int menu = scan.nextInt();
		return menu;
	}
	
	private static int[][] createAutoLottos() {

		return null;
	}
	
	private static int[][] createManualLottos() {

		return null;
	}
	
	private static void printLottos(int[][] lottos) {
		
	}

}
