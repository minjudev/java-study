package part3.ex02.메소드;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamList list = new ExamList();
		list.init();
		//캡슐화를 깨는 코드이므로 ExamList.java에서 private 접근 제어 지시자를 통해 접근 막아줌
		//list.current = 3;

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {
			case 1:
				//ExamList.inputList(list);
				list.inputList();
				break;
			case 2:
				//ExamList.printList(list);
				list.printList();
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
	
}
