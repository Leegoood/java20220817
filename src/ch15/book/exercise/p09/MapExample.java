package ch15.book.exercise.p09;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;  // 최고 점수를 받은 아이디 저장
		int maxScore = 0;    // 최고 점수 저장
		int totalScore = 0;  // 점수 합계 저장
		
		// 작성 위치
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			Integer value = map.get(key);
			totalScore += value;
			
			if(value > maxScore) {
				maxScore = value;
				name = key;
			}
		}
		
		System.out.println("최고아이디 : " + name);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("합 : " + totalScore);
		System.out.println("평균 : " + totalScore / (double)map.size());
		
	}
}
