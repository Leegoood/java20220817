package leetcode;

import java.util.HashMap;
import java.util.Map;

public class S1512NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
           if(map.containsKey(num)){
               // 이미 있었으면
               Integer val = map.get(num);
               map.put(num, val + 1);
           }else{
               // 처음
               map.put(num, 1);
           }
        }
        int result = 0;
        
        for(Integer n : map.values()){
        
            Integer r= (n - 1) * n / 2;
            result += r;
        }
        
        
        return result;
    }
} 

