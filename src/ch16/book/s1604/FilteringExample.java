package ch16.book.s1604;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");
		
		names.stream()
			.distinct() // 중복(신용권) 제거
			.forEach(n -> System.out.println(n)); // 홍길동 신용권 김자바 신민철 한 줄씩 출력
		System.out.println(); // 한 줄 공백
		
		names.stream() // 홍길동 신용권 김자바 신민철 한 줄씩 출력
			.filter(n -> n.startsWith("신"))  // "신" 필터링
			.forEach(n -> System.out.println(n)); // "신"들어간 스트링 출력(신용권,신용권,신민철)
		System.out.println();
		
		names.stream()
			.distinct() // 중복(신용권) 제거 후 필터링
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n)); // 신용권, 신민철 출력 한 줄 씩 출력
	}
}
