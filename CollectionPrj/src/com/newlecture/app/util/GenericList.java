package com.newlecture.app.util;

public class GenericList<T> {
	
	private Object[] nums;
	private int current;
	private int capacity; // �뷮
	private int amount; // �߰� ������
	
	public GenericList() {
		current = 0;
		capacity = 3;
		amount = 5;
		nums = new Object[capacity]; // �ڹٴ� Object���� �⺻
	}

	public void add(T num) { // ������ ���� T������ ����ȯ
		
		if(capacity <= current) {
			Object[] temp = new Object[capacity + amount];
			for(int i=0; i<current; i++)
				temp[i] = nums[i];
			
			nums = temp;
			capacity += amount;
		}
		
		nums[current] = num;
		current++;
	}

	public void clear() {
//		for(int i=0; i<current; i++)
//			nums[i] = 0;
		
//		nums = new int[3];
		current = 0;
	}

	public int size() {
		return current;
	}

	public T get(int index) { // ������ ���� T������ ����ȯ
		if(current <= index)
			throw new IndexOutOfBoundsException();
		
		return (T)nums[index];
	}
	

}
