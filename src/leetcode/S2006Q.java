package leetcode;

import java.util.*;

public class S2006Q {
	public int countKDifference(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums) {
			map.computeIfPresent(num, (key, val) -> val + 1);
			map.computeIfAbsent(num, (key) ->  1);
		}
		
		System.out.println(map);
		int result = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer target1 = key - k;
			Integer target2 = key + k;
			
			Integer val = entry.getValue();
			Integer targetVal1 = map.get(target1);
			Integer targetVal2 = map.get(target2);
			
			if(targetVal1 != null) {
				result += val * targetVal1;
			}
			if(targetVal2 != null) {
				result += val * targetVal2;
			}
		}
		result /= 2;
		return result;
	}
}
