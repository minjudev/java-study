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
			// -------------- �� �� �Է� �κ� ---------------
			System.out.println("����������������������������������������");
			System.out.println("��      ���� �Է�     ��");
			System.out.println("����������������������������������������");
			System.out.print("����1: ");
			kor1 = scan.nextInt();
			
			//if (!(0 <= kor1 && kor1 <= 100)) 
			//if (0 > kor1 || kor1 > 100) 
			while (kor1 < 0 || 100 < kor1) {
				System.out.println("���� ����(0 ~ 100)�� ������ϴ�");
				
				System.out.print("����1: ");
				kor1 = scan.nextInt();
			}
			
			System.out.print("����2: ");
			kor2 = scan.nextInt();
			System.out.print("����3: ");
			kor3 = scan.nextInt();
	
			// -------------- ���� ��� �κ� ---------------
			total = (kor1 + kor2 + kor3);
			avg = total / 3.0f;
	
			System.out.println("����������������������������������������");
			System.out.println("��      ���� ���     ��");
			System.out.println("����������������������������������������");
				
			// i�� �ʱ�ȭ ���� 0���� �����ϴ� �� ����
			// i(index): 0~
			// n(number): 1~
			// for(int n=1; n<=3, n++)
			for(int i=0; i<3; i++) {
				System.out.printf("\t����%d : %3d\n", i+1, kor1);		
			}
			
			// 3, 2, 1�� ����ϴ� �ݺ��� 
			// �� �ڵ�
//			for(int i=3; i>=1; i--) {
//				System.out.printf("\t����%d : %3d\n", i, kor1);		
//			}
			
			// ������ �ڵ�
//			for(int i=0; i<3; i++) {
//				System.out.printf("\t����%d : %3d\n", 3-i, kor1);
//			}
			
			System.out.printf("\t���� : %3d\n", total);
			System.out.printf("\t��� : %6.2f\n", avg);
			System.out.println("����������������������������������������");
		}
		
	}
}