package ch15.lecture.p03map;

import java.util.*;

public class C03Map {
	public static void main(String[] args) {
		// Map 만들기
		Map<String, String> map1 = new HashMap<>();
		map1.put("seoul", "korea");
		map1.put("busan", "korea");
		map1.put("osaka", "japan");
		map1.put("newyork", "us");
		
		System.out.println(map1);
		
		// of 메소드 사용
		Map<String, String> map2 = Map.of("seoul", "korea","busan", "korea","osaka", "japan","newyork", "us");
//		map2.put("london", "uk"); // xx  
//		map2.put("busan", "china"); // xx
//		map2.remove("osaka");  // xx
		System.out.println(map2.size());
		System.out.println(map2.containsKey("seoul"));
		System.out.println(map2);
		System.out.println();
		
		Map<String, String> europe = new HashMap<>();
		europe.put("madrid", "spain");
		europe.put("interaken", "swiss");
		europe.put("berlin", "germany");
		System.out.println(europe.size());
		System.out.println(europe.containsKey("Nagoya"));
		System.out.println(europe);
		System.out.println();
		
		Map<String, String> e2 = Map.of("madrid", "spain","interaken", "swiss");
		System.out.println(e2.size());
		System.out.println(e2.containsKey("swiss"));
		System.out.println(e2);
		
	}
}
