package part3.ex04.UI코드분리하기;

public class ExamList {
	//데이터 구조에 대해서는 private 사용
	private Exam[] exams;
	private int current;
	
	public void add(Exam exam) {
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

	public Exam get(int i) {
		return this.exams[i];
	}

	public ExamList() {
		//this를 지워도 괜찮음
		exams = new Exam[3];
		current = 0;		
	}

	
	public int size() {
		return current;
	}

}
