package leetcode;

import java.util.HashSet;
import java.util.Set;

//보석인 stones의 종류를 나타내는 String과 가지고
//있는 stones을 나타내는 String이 주어집니다. 
//stones의 각 캐릭터는 당신이 가지고 있는
//stones의 한 종류입니다. 여러분이 가지고 있는
//stones들 중 몇 개가 보석인지 알고자 합니다.
//글자는 대소문자를 구분하기 때문에
//"a"는 "A"와 다른 종류의 stones로 간주된다
public class S771JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>(); 
        for(int i = 0; i < jewels.length(); i++){
            set.add(jewels.charAt(i));
        }
        
        int cnt = 0;
        for (int i = 0; i < stones.length(); i++){
            if(set.contains(stones.charAt(i))){
                 cnt++;
            }
           
        }
            
        return cnt;
    }
}
