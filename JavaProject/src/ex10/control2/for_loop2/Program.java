package ex10.control2.for_loop2;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int total = 0;
		
		// 1 ~ 10���� ���ϱ�
		for(int i=0; i<10; i++) {
			total += 1+i;
		}
		
		// 3 ~ 7���� ���ϱ�
		// ���� ������ ����Ǵ� �ݺ���
		for(int i=0; i<5; i++) {
			total += 3+i;
		}
		
		// ���� ���� ������ ����Ǵ� �ݺ���
		// �� ���ϴ� ����
		// n*(a+l)/2
		total = 5*(3+7)/2;
		
		System.out.printf("Total is : %d\n", total);
	}
}