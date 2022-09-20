package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel { // 병렬 스트림
	public static void main(String[] args) {
		List<String> list1 = List.of("java", "spring", "css", "jsp", "html");
		
		list1.parallelStream()  // 순서보장 X  
			.forEach((e) -> System.out.println(e));  
		System.out.println("============");
		
		list1.parallelStream()  // 순서보장
			.forEachOrdered((e) -> System.out.println(e));  
	}
}
