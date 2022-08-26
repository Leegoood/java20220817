package p99codingbat;

public class WarmUp3Array {
	public boolean firstLast6(int[] nums) {
		  int first = nums[0];
		  int last = nums[nums.length -1];
		  
		  return first == 6 || last == 6;
		  
		}
}
