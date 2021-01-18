package part3.ex04.UI코드분리하기;

// class는 사용자가 원하는 형식의 데이터 구조를 정의해줌
public class Exam {
	int kor;
	int eng;
	int math;

	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int total() {
		return kor + eng + math;
	}

	public float avg() {
		return total() / 3.0f;
	}

}
