package part3.ex01.ĸ��ȭ;

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
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �޴��� 1~3�����Դϴ�.");

			}

		}

	}

	static int inputMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �޴�          ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1. ���� �Է� ");
		System.out.println("\t2. ���� ��� ");
		System.out.println("\t3. ���� ");
		System.out.print("\t����> ");
		int menu = scan.nextInt();

		return menu;
	}
	
}
