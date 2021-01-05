package ex19.array;

public class Program1 {

	public static void main(String[] args) {
		  
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		  
		for(int i=0; i<7; i++) 
			System.out.printf("%d", nums[i]);
		  
		// 배열 nums에 8이라는 요소를 추가하기 위한 작업 // 배열 nums를 배열 temp로 이전하는 작업도 함께 실행되어야 함
		int[] temp = new int[10];
		  
		for(int i=0; i<7; i++) 
			temp[i] = nums[i];
		  
		// 참조를 nums로 바꾼 것 
		nums = temp;
		
		nums[7] = 8;
		  
		for(int i=0; i<8; i++) 
			System.out.printf("%d", nums[i]); 
	}

}
