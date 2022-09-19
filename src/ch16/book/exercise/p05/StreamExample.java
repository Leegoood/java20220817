package ch16.book.exercise.p05;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java7 supports lambda expressions"
		);
		list.stream()
		// 코드 작성
		.filter((s) -> s.toUpperCase().contains("java".toUpperCase()))
		.forEach(e -> System.out.println(e));
		
	}
}
