package com.newlecture.app.util;

public class GenericList<T> {
	
	private Object[] nums;
	private int current;
	private int capacity; // 용량
	private int amount; // 추가 증가량
	
	public GenericList() {
		current = 0;
		capacity = 3;
		amount = 5;
		nums = new Object[capacity]; // 자바는 Object형이 기본
	}

	public void add(T num) { // 들어오는 값을 T형으로 형변환
		
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

	public T get(int index) { // 나가는 값도 T형으로 형변환
		if(current <= index)
			throw new IndexOutOfBoundsException();
		
		return (T)nums[index];
	}
	

}
