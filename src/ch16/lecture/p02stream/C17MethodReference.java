package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C17MethodReference {
	public static void main(String[] args) {
		Stream.of("spring", "java","css")
			.forEach((e) -> System.out.println(e));  // 같은 값 출력
		System.out.println("================");
		
		Stream.of("spring", "java","css")
			.forEach(System.out::println);           // 같은 값 출력
		System.out.println("================");
		
		

	}
}
