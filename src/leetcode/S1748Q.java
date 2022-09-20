package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class S1748Q {
		// stream api
    public int sumOfUnique(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == 1)
            .mapToInt(e -> e.getKey())
            .sum();      
    }
}    
    
    
//      classic

//    public int sumOfUnique(int[]nums) {
//    	// key : number
//    	// value : 몇개
//    	Map<Integer, Integer> map = new HashMap<>();
//    		for(int num : nums) {
//    			if(map.containsKey(num)) {
//    				//map 에 있으면
//    				int val = map.get(num);
//    				val++;
//    				map.put(num, val);
//    			}else {
//    				// map 에 없으면
//    				map.put(num, 1);
//    			}
//    		}
//    	int sum = 0;
//    	Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//    	for(Map.Entry<Integer, Integer> entry : entries) {
//    		if(entry.getValue() == 1) {
//    			sum += enter.getKey();
//    		}
//    	}
//    	return sum;
//    }

