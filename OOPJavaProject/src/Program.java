import part3.ex04.UI�ڵ�и��ϱ�.Exam;

public class Program {
	
	public static void main(String[] args) {
		NewlecExam exam = new NewlecExam();
		exam.setKor(10);
		exam.setEng(10);
		exam.setMath(10);
		exam.setCom(10);
		
		System.out.println(exam.total());
	}

}