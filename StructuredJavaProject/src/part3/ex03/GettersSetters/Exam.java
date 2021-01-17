package part3.ex03.GettersSetters;

// class는 사용자가 원하는 형식의 데이터 구조를 정의해줌
public class Exam {
	int kor1;
	int eng;
	int math;
	
	public int getKor() {
		return kor1;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setKor(int kor) {
		this.kor1 = kor;
	}

	public void setEng(int eng2) {
		this.eng = eng;
	}

	public void setMath(int math2) {
		this.math = math;
	}
}
