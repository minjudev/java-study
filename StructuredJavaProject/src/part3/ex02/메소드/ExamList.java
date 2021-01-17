package part3.ex02.메소드;

import java.util.Scanner;

public class ExamList {
	//데이터 구조에 대해서는 private 사용
	private Exam[] exams;
	private int current;
	
	//서비스해야하는 메소드는 public 사용
	public void inputList() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력         │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("국어: ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("국어 성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어: ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("영어 성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학: ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("수학 성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (math < 0 || 100 < math);

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;

		Exam[] exams = this.exams;
		int size = this.current;

		// 배열 공간 부족
		if (exams.length == size) {
			// 1. 크기가 5개 더 큰 새로운 배열 생성
			Exam[] temp = new Exam[size + 5];
			// 2. 값을 이주시키기
			for (int i = 0; i < size; i++)
				temp[i] = exams[i];
			// 3. list.exams가 새로 만든 temp 배열을 참조하도록 하기
			exams = temp;
		}

		exams[current] = exam;
		current++;

	}
	
	public void printList() {
		printList(current);
	}

	public void printList(int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력         │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		// int size = list.current;
		Exam[] exams = this.exams;

		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			// 변수 선언은 반복되지 않음
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			int total = kor + eng + math;
			float avg = total / 3.0f;

			System.out.printf("국어: %d\n", kor);
			System.out.printf("영어: %d\n", eng);
			System.out.printf("수학: %d\n", math);

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────");

		}
	}

	public ExamList() {
		//this를 지워도 괜찮음
		exams = new Exam[3];
		current = 0;		
	}

}
