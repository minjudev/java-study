package ex6.operator;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		Scanner scan = new Scanner(System.in);
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		// -------------- ���� �Է� �κ� ---------------
		System.out.println("����������������������������������������");
		System.out.println("��      ���� �Է�     ��");
		System.out.println("����������������������������������������");
		System.out.print("���� 1: ");
		kor1 = scan.nextInt();
		
		int validate = (0 <= kor1 && kor1 <= 100) ? 1 : 0;
		System.out.println(validate);
		
		System.out.print("���� 2: ");
		kor2 = scan.nextInt();
		System.out.print("���� 3: ");
		kor3 = scan.nextInt();

		// -------------- ���� ��� �κ� ---------------
		total = (kor1 + kor2 + kor3);
		avg = total / 3.0f;

		System.out.println("����������������������������������������");
		System.out.println("��      ���� ���     ��");
		System.out.println("����������������������������������������");
			
		System.out.printf("\t����1 : %3d\n", kor1);		
		System.out.printf("\t����2 : %3d\n", kor2);
		System.out.printf("\t����3 : %3d\n", kor3);
		System.out.printf("\t���� : %3d\n", total);
		System.out.printf("\t��� : %6.2f\n", avg);
		System.out.println("����������������������������������������");
		
	}
}