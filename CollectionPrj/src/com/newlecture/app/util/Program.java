package com.newlecture.app.util;

public class Program {

	public static void main(String[] args) {
		GenericList<Integer/*Object�μ��� ���ĺ�ȯ�� ������ wrapper Ŭ������ ���*/> list = new GenericList<>();
		list.add(3);
		list.add(5);
		int size = list.size();
		System.out.printf("size: %d\n", size);
				
		list.clear();
		size = list.size();
		System.out.printf("size: %d\n", size);
		
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(1);
		
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(1);
		
		list.add(7);
		list.add(5);
		list.add(3);
		list.add(1);
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%d", list.get(i));
			
			if(i<list.size() - 1)
				System.out.print(", ");
		}	
			
		System.out.println();
		System.out.printf("size: %d\n", size);

		int num = list.get(0); // Object(�������� wrapper Ŭ������ ��ȯ��) -> Integer�� �ٲپ�� ��
										// new Integer(7) -> 7			
		System.out.printf("num: %d\n", num);
//		num = (Integer)list.get(1);
	}

}
