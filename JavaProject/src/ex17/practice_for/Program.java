package ex17.practice_for;

public class Program {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) 
			// if�� �ۼ� �� �켱������ �� �����ϱ�
			// if���� ���� ���� ������ ������ ���� �������� �����̾�� ��
			// if - else if - else�� ������ ������ ������ �� Ŀ������ �ۼ��ϱ�
			if(i==4)
				System.out.printf("%c", 'A'+i);
			else if(i%2==0)
				System.out.printf("%c, ", ' ');
			else
				System.out.printf("%c, ", 'A'+i);
		
	}

}
