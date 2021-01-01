package ex16.practice_star;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		for(int j=0; j<10; j++) {
			for(int i=0; i<10-j; i++)
				System.out.printf("%c", '¡Ù');
		
			System.out.println();
		}
	}
}