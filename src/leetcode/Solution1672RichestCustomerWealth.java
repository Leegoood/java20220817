package leetcode;

public class Solution1672RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        
    int sum = 0;
        for(int i = 0; i < accounts.length; i++){
        
            int ksum = 0;
            
                for(int k = 0; k < accounts[i].length; k++){
                
                ksum = ksum + accounts[i][k];
                 
                }
        
                if(sum < ksum){
                 sum = ksum;
                }               
         }
        return sum;
    }
}
