package leetcode;
// Q. 세 개의 정수 배열 num1, num2 및 num3이 주어지면
// 세 개의 배열 중 적어도 두 개에 있는 모든 값이 
// 포함된 고유한 배열을 반환합니다. 
// 값은 임의의 순서로 반환할 수 있습니다.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        
        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            set2.add(num);
        }
        for(int num : nums3){
            set3.add(num);
        }
        
        Set<Integer> all = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for(Integer num : set1){
            all.add(num);
        }
        for(Integer num : set2){
            if(!all.add(num)){
                res.add(num);
            }
        }
        for(Integer num : set3){
            if(!all.add(num)){
                res.add(num);
            }
        }
        return new ArrayList<Integer>(res);
        
    }
}
