package ex19.array;

public class Program4 {

	public static void main(String[] args) {

		int[] nums = {1, 2, 6, 4, 5, 3, 7};
		
		int temp;
		temp = nums[2];
		nums[2] = nums[5];
		nums[5] = temp;
		
		for(int i=0; i<7; i++)
			System.out.printf("%d", nums[i]);
		
	}

}
