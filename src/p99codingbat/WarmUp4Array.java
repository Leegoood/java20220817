package p99codingbat;

public class WarmUp4Array {
	public boolean sameFirstLast(int[] nums) {
		  if(nums.length > 0){
		  int first = nums[0];
		  int last = nums[nums.length - 1];
		  
		  return first == last ;
		  }
		  return false;
		  
		}
}
