package part3.ex04.UI�ڵ�и��ϱ�;

public class ExamList {
	//������ ������ ���ؼ��� private ���
	private Exam[] exams;
	private int current;
	
	public void add(Exam exam) {
		Exam[] exams = this.exams;
		int size = this.current;

		// �迭 ���� ����
		if (exams.length == size) {
			// 1. ũ�Ⱑ 5�� �� ū ���ο� �迭 ����
			Exam[] temp = new Exam[size + 5];
			// 2. ���� ���ֽ�Ű��
			for (int i = 0; i < size; i++)
				temp[i] = exams[i];
			// 3. list.exams�� ���� ���� temp �迭�� �����ϵ��� �ϱ�
			exams = temp;
		}

		exams[current] = exam;
		current++;
	}

	public Exam get(int i) {
		return this.exams[i];
	}

	public ExamList() {
		//this�� ������ ������
		exams = new Exam[3];
		current = 0;		
	}

	
	public int size() {
		return current;
	}

}
