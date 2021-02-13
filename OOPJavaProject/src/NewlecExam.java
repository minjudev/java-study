import part3.ex04.UI코드분리하기.Exam;

public class NewlecExam extends Exam {

	private int com;

	public NewlecExam() {
		this(0, 0, 0, 0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		
		// 부모 생성자를 호출해서 kor, eng, math를 세팅하게 함
		super(kor, eng, math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	 @Override
	public int total() {
	
		 return super.total()+com;
	}
	 
	 @Override
	public float avg() {
	
		 return total()/4.0f;
	}
}
