package ex15.m_array;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {

		//int kor1, kor2, kor3;
		//int[] kors = new int[3*3];
		int[][] kors = new int[3][3];
		int[] total = new int[3];
		float[] avg = new float[3];
		int menu;

		Scanner scan = new Scanner(System.in);

		/*
		 * kor1 = 0; kor2 = 0; kor3 = 0;
		 */

		for (int j=0; j<3; j++) {
			for (int i=0; i<3; i++) {
				//1���������� ��������δ� 2�������� �����ϰ� �ٷ� �� ����
				//kors[3*j + i] = 0;
				kors[j][i] = 0;
			}
		}

		//"����"��� �� �̿��ؼ� while������ �����
		����: while (true) {
			//-------------- ���� �޴� �κ� ---------------
			System.out.println("����������������������������������������");
			System.out.println("��      ���� �޴�      ��");
			System.out.println("����������������������������������������");
			System.out.println("\t1. ���� �Է�");
			System.out.println("\t2. ���� ���");
			System.out.println("\t3. ����");
			System.out.print("\t>");
			menu = scan.nextInt();

			switch (menu) {

			case 1:

				//-------------- ���� �Է� �κ� ---------------
				System.out.println("����������������������������������������");
				System.out.println("��      ���� �Է�     ��");
				System.out.println("����������������������������������������");

				/*
				 * do { System.out.print("����1: "); kor1 = scan.nextInt();
				 * 
				 * if(kor1 < 0 || 100 < kor1) { System.out.println("���� ����(0 ~ 100)�� ������ϴ�"); }
				 * } while (kor1 < 0 || 100 < kor1); // while ������ ������ ���̸� �ٽ� do �ڵ�� ���ư�
				 * 
				 * do { System.out.print("����2: "); kor2 = scan.nextInt();
				 * 
				 * if(kor2 < 0 || 100 < kor2) { System.out.println("���� ����(0 ~ 100)�� ������ϴ�"); }
				 * } while(kor2 < 0 || 100 < kor2);
				 * 
				 * do { System.out.print("����3: "); kor3 = scan.nextInt();
				 * 
				 * if(kor3 < 0 || 100 < kor3) { System.out.println("���� ����(0 ~ 100)�� ������ϴ�"); }
				 * } while(kor3 < 0 || 100 < kor3);
				 */

				for (int j=0; j< 3; j++) {
					for (int i=0; i<3; i++) {
						do {
							System.out.printf("%d�г� ����%d: ", j+1, i+1);
							kors[j][i] = scan.nextInt();

							if (kors[j][i] < 0 || 100 < kors[j][i]) {
								System.out.println("���� ����(0 ~ 100)�� ������ϴ�");
							}
						} while (kors[j][i] < 0 || 100 < kors[j][i]);
					}
				}

				break;

			case 2:

				//-------------- ���� ��� �κ� ---------------

				//total = (kor1 + kor2 + kor3);
				//total = kors[0] + kors[1] + kors[2];

				System.out.println("����������������������������������������");
				System.out.println("��      ���� ���      ��");
				System.out.println("����������������������������������������");

				for (int j=0; j<3; j++) {
					System.out.printf("<%d�г� ���� ����>---------\n", j+1);
					
					for (int i=0; i<3; i++) {
						System.out.printf("\t����%d : %3d\n", i+1, kors[j][i]);
						
						total[j] += kors[j][i]; 
					}
					
					avg[j] = total[j] / 3.0f;	   

					System.out.printf("\t���� : %3d\n", total[j]);
					System.out.printf("\t��� : %6.2f\n", avg[j]);
					System.out.println("����������������������������������������");
				}

				//switch���� ����� break
				break;

			case 3:
				//switch�� �ȿ��� break�� ������ ���� �ڵ� �� while������ ����� ���ϰ� switch�������� ���
				//"����"��� �� �̿��ؼ� while������ �����
				break ����;

			//switch������ default�� if else���� else�� �ش�
			default:
				System.out.println("�Է� ����");

			}
		}

		System.out.println("good bye!");
	}
}