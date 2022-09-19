package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class C05IntStream {
	public static void main(String[] args) {
		// 기본타입 int가 요소인 Stream
		
		// 생성방법1 : of static 메소드
		int r1 = IntStream.of(10, 9, 20, 2, 3, -1)
			.sum();
		System.out.println(r1);
		System.out.println("==================");
		
		// 생성방법2 : Arrays.stream static 메소드
		int r2 = Arrays.stream(new int[] {10, 9, 20, 2, 3, -1})
			.sum();
		System.out.println(r2);
		System.out.println("==================");
		
		// 생성방법3 : IntStream.range static 메소드
		// 		       IntStream.rangeClosed
		int r3 = IntStream.range(1, 11)
			.sum();
		System.out.println(r3);
		System.out.println("==================");
		
		int r4 = IntStream.rangeClosed(1, 10)
			.sum();
		System.out.println(r4);
		System.out.println("==================");
		
		// 생성방법4 : IntStream.ganerate static 메소드
		IntStream.generate(() -> 1)
			.limit(5)
			.forEach(e -> System.out.println(e));
		System.out.println("==================");
		
		IntStream.generate(() -> (int)(Math.random() * 45) +1)
			.limit(6)
			.forEach(e -> System.out.println(e));
		System.out.println("==================");
				
			
		
		
	}
}
