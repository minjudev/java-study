package part2.ex01.�����Էºκг�����;

import java.util.Scanner;

public class StructuredProgram {
	
	// ���������� ���� �Լ� 2���� �ڿ��� ������ �� ����
	// ���������� ����� ���ؼ��� �ݵ�� �տ� static�� �ۼ������ ��
	// static int[] korList = new int[3];
	
    public static void main(String[] args) {
    	
    	int[] korList = new int[3];
    	
        int menu;
        boolean keepLoop = true;			
				
		while(keepLoop) {
			
			menu = inputMenu();
	        
	        switch(menu) {	        
	        case 1:	      
	        	// int[] korList�� �ش�Ǵ� ����(new int[3]�� �ּ�)�� �Ʒ� �Ű�����(korList)�� ���޵� 
	        	inputKors(korList);  
		        break;		        
	        case 2:		        
		        printKors(korList);	        	
		        break;		        
	        case 3:
	        	System.out.println("Good bye :)");
	        	
	        	keepLoop = false;
				break;	        
	        default:
	        	System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �޴��� 1~3�����Դϴ�.");	       
	
	        }
	        
		}
    }
    
    static int inputMenu() {
		Scanner scan = new Scanner(System.in);
    	    	
    	System.out.println("����������������������������������������������������������");
        System.out.println("��           ���� �޴�          ��");
        System.out.println("����������������������������������������������������������");
        System.out.println("\t1. ���� �Է� ");
        System.out.println("\t2. ���� ��� ");
        System.out.println("\t3. ���� ");
        System.out.print("\t����> ");
        int menu = scan.nextInt();

        return menu;
    }
    
    // �Ű������� � �̸����� �� ���ΰ��� �� ���� ������ ���ϴ� ���̹Ƿ� �Ű������� ���޹��� ���� �������� ���� �����ص� ��
    static void inputKors(int[] kors) {
    	
    	// ���� ������ �ʿ䰡 ���� �ڵ�� �ش� �Լ����� ������ �ڵ带 �ۼ����ָ� ��
		Scanner scan = new Scanner(System.in);
    	int kor;
		
    	System.out.println("����������������������������������������������������������");
        System.out.println("��           ����  �Է�         ��");
        System.out.println("����������������������������������������������������������");
        System.out.println();
       		        
        for(int i=0; i<3; i++) {
	        do {
		        System.out.printf("���� %d: ", i+1);
		        kor = scan.nextInt();
	        
		        if(kor < 0 || 100 < kor)
		        	System.out.println("���� ������ 0~100������ ������ �Է��� �����մϴ�.");
		        
	        } while(kor < 0 || 100 < kor);
        
        	kors[i] = kor;
        }
        
        System.out.println("����������������������������������������������������������");
    }

    static void printKors(int[] kors) {
    	
        int total = 0;
        float avg;
    	
    	for(int i=0; i<3; i++)
        	total += kors[i];
        
        avg = total / 3.0f;
        
        System.out.println("����������������������������������������������������������");
        System.out.println("��           ����  ���         ��");
        System.out.println("����������������������������������������������������������");
        System.out.println();		        
       
        for(int i=0; i<3; i++)
        	System.out.printf("���� %d: %3d\n", i+1, kors[i]);	        	
        	        
        System.out.printf("���� : %3d\n", total);
        System.out.printf("��� : %6.2f\n", avg);
        System.out.println("����������������������������������������������������������");
    }
} 
