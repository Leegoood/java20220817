package leetcode;

import java.util.ArrayList;
import java.util.List;


public class S118PascalsTriangle1 {
     List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        
        list.add(firstRow);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> next = new ArrayList<>();
            List<Integer> current = list.get(list.size() - 1);
            
            next.add(1);
            for(int j = 1; j < current.size(); j++){
               next.add(current.get(j) + current.get(j - 1));
            }
            next.add(1);
            list.add(next);
        }
        return list;
    }
}


//public class Solution118PascalsTriangle1 {
//	public List<List<Integer>> generate(int numRows) {
//		List <List<Integer>> res = new ArrayList<>();
//	        
//	    	for(int i = 0; i < numRows; i++){
//	    		List<Integer> row = new ArrayList<>(1);
//	            
//	    		if( i != 0){
//	        	row.add(1);
//	    		}
//	            
//	    	for(int j = 0; j < i - 1; j++){
//	    		List<Integer> before = res.get(i-1);
//	    		row.add(before.get(j) + before.get(j + 1));
//	    	}
//	            
//	        row.add(1);
//	        res.add(row);
//	    }
//	        return res;
//	  }
//}

