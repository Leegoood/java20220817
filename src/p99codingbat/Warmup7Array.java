package p99codingbat;

public class Warmup7Array {
	public int[] rotateLeft3(int[] nums) {
//  return new int[]{nums[1],nums[2],nums[0]};
		 int temp =nums[0];
		  nums[0] = nums[1];
		  nums[1] = nums[2];
		  nums[2] = temp;
		  
		  return nums;
		
		}
}
