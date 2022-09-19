package leetcode;

import java.util.*;

public class S2206Q {
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : nums) {
			map.compute(num, (k, v) -> map.containsKey(k) ? v + 1 : 1);
		}
		
		java.util.Collection<Integer> values = map.values();
		
		for(Integer value : values) {
			if(value % 2 == 1) {
				return false;
			}
		}
		return true;
		
	}
}
