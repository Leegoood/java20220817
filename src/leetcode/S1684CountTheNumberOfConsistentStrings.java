package leetcode;

import java.util.HashSet;
import java.util.Set;

//고유한 문자와 문자열 단어 배열로 구성된
//문자열이 제공됩니다. 문자열의 모든 문자가
//허용된 문자열에 나타나는 경우 문자열은 동일합니다.
//배열 워드의 일관된 문자열 수를 반환합니다.

// allowed 문자열로만 구성된 words 배열 내 문자열의 개수를 반환하세요.

public class S1684CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
//        int cnt = 0;
//        for (String word : words) {
//            if (consistOf(allowed, word)) {
//                cnt++;   
//            }
//        }
//        
//        return cnt;
//    }
//    
//    private boolean consistOf(String allowed, String word) {
//        for (int i = 0; i < word.length(); i++) {
//            if (!hasChar(allowed, word.charAt(i))) {
//                return false;
//            }
//        }
//        
//        return true;
//    }
//    
//    private boolean hasChar(String allowed, char c) {
//        for (int i = 0; i < allowed.length(); i++) {
//            if (allowed.charAt(i) == c) {
//                return true;
//            }
//        }
//        
//        return false;
    Set<Character> set = new HashSet<>();
        
        for(int i = 0 ; i < allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        int cnt = 0;
        for(String word : words){
            int i = 0;
            for(; i < word.length(); i++){
                // word의 문자가 set에 모두 있는가? 하나라도 없으면 cnt하지 않겠다
                if(!set.contains(word.charAt(i))){
                    break;
                }
            }
            if(i == word.length()){
                cnt++;
            }
        }   
         return cnt;    
    	
    	
    	
    	
    }
}