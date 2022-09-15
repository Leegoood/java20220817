package leetcode;
//Q. 각 정수가 [1, n] 포함 범위에 있는 n + 1 
// 정수를 포함하는 정수 수의 배열이 주어집니다.
// 숫자에 반복된 숫자가 하나밖에 없습니다. 
// 이 반복된 숫자를 반환합니다.
// 어레이 번호를 수정하지 않고 문제를 해결해야하며
// 일정한 추가 공간만 사용합니다.


// A. 중복자료를 사용하지 않는 Set을 사용해서 코드 작성.


import java.util.*;
public class S287FindtheDuplicateNumber {
	 public int findDuplicate(int[] nums) {
	        int len = nums.length;
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < len; i++) {
			if(!set.add(nums[i])) {
				return nums[i];
			}
		}
		return -1;
	    }
}
