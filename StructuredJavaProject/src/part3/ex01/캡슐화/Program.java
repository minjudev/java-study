package part3.ex01.캡슐화;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamList list = new ExamList();
		ExamList.init(list);

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {
			case 1:
				ExamList.inputList(list);
				break;
			case 2:
				ExamList.printList(list);
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
