package part3.ex02.�޼ҵ�;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamList list = new ExamList();
		list.init();
		//ĸ��ȭ�� ���� �ڵ��̹Ƿ� ExamList.java���� private ���� ���� �����ڸ� ���� ���� ������
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
