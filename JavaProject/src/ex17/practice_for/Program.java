package ex17.practice_for;

public class Program {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) 
			// if문 작성 시 우선순위를 잘 생각하기
			// if문의 가장 위의 조건이 범위가 가장 한정적인 조건이어야 함
			// if - else if - else로 갈수록 조건의 범위가 더 커지도록 작성하기
			if(i==4)
				System.out.printf("%c", 'A'+i);
			else if(i%2==0)
				System.out.printf("%c, ", ' ');
			else
				System.out.printf("%c, ", 'A'+i);
		
	}

}
