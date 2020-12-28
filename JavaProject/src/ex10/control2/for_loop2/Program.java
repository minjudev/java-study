package ex10.control2.for_loop2;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int total = 0;
		
		// 1 ~ 10까지 더하기
		for(int i=0; i<10; i++) {
			total += 1+i;
		}
		
		// 3 ~ 7까지 더하기
		// 많은 연산이 수행되는 반복문
		for(int i=0; i<5; i++) {
			total += 3+i;
		}
		
		// 보다 적은 연산이 수행되는 반복문
		// 합 구하는 공식
		// n*(a+l)/2
		total = 5*(3+7)/2;
		
		System.out.printf("Total is : %d\n", total);
	}
}