package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CCC {
	public static void main(String[] args) {
		
	// stream 연산
	// 1. 중간 연산(중간 처리)  api : intermediate operation
	// 2. 종료 연산(최종 처리)  api : terminal operation
	
	// 구분법 : 중간 연산 (method)은 리턴 타입이 Stream
	//        : 최종 연산 (method)은 리턴 타입이 Stream이 아님 (주로)
	
	Stream<String> stream1 = List.of("java", "css", "spring", "html", "jsp").stream();
	
	// findAny : 아무거나 하나
	Optional<String> option1 = stream1.findAny();
	System.out.println(option1.orElse("없네요"));
	
	Stream<String> stream2 = List.of("java", "css", "spring", "html", "jsp").stream();
	// findFirst : 첫번째 element
	Optional<String> option2 = stream2.findFirst();
	System.out.println(option2.orElse("없네요"));
	
	// max : 가장 큰 element
	Stream<String> stream3 = List.of("java", "css", "spring", "html", "jsp").stream();
	Optional<String> option3 = stream3.max((a, b) -> a.compareTo(b));
	System.out.println(option3.get());
	
	// min : 가장 작은 element
	Stream<String> stream4 = List.of("java", "css", "spring", "html", "jsp").stream();
	Optional<String> option4 = stream4.min((a,b) -> a.compareTo(b));
	System.out.println(option4.get());
	
	IntStream stream5 = IntStream.of(100, 200, 50, -50, 7, 6, 9);
	OptionalInt max1 = stream5.max();
	System.out.println(max1.getAsInt());
	
	IntStream stream6 = IntStream.of(100, 200, 50, -50, 7, 6, 9);
	OptionalInt min1 = stream6.min();
	System.out.println(min1.getAsInt());
	
	
	
	
	
	
	}
	
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		stream1.forEach((e)-> System.out.println(e));
		System.out.println("=============================================");
		
		Stream<String> stream2 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		Optional<String> o1 = stream2.reduce((a, b) -> a + " , " + b);
		System.out.println(o1.get());
		System.out.println("=============================================");
		
		Stream<String> stream3 = Stream.of("ironman", "panther", "widow", "spider", "captain");
		String o2 = stream3 .reduce("heros", (a,b) -> a + " , " + b);
		System.out.println(o2)	
	}
	
	public static void main(String[] args) {
		// 중간 연산(메소드) : 리턴 타입 -> xxxStream
		// limit : element 갯수 제한
		
		Integer r1 = Stream.of(3, 4, 5, 9, -1, 10, 11)
				.limit(5)
				.max((x, y) -> x - y)
				.get();
		System.out.println(r1);
		System.out.println("================================");
		
		// skip : element 몇 개 무시
		Integer r2 = Stream.of(3, 4, 5, 9, 10, 11)
				.skip(2)
				.min((x,y) -> x - y)
				.get();
		System.out.println(r2);
		System.out.println("================================");
		
		// filter : predicate에서 true 나온것만 추림
		Integer r3 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e % 2 == 0)
				.reduce((x,  y) -> x + y)
				.get();
		System.out.println(r3);
		System.out.println("================================");
		
		// filter : predicate에서 true 나온것만 추림
		Integer r4 = Stream.of(3,4,5,6,7)
				.filter((e)-> e % 2 == 1) // 홀수만 나오게
				.reduce((x, y) -> x + y)
				.get();
		System.out.println(r4);
		System.out.println("================================");
		
		
		// distinct : 중복 제거
		Integer r5 = Stream.of(3,3,4,4,5,5,6,7)
				.distinct() // 중복제거
				.reduce((x, y) -> x + y)
				.get();
		System.out.println(r5);
		System.out.println("================================");
		
		// sorted : 정렬한 스트림 리턴
		Stream.of(5,3,0,7,9,1)
			.sorted()
			.forEach(e -> System.out.println(e));
		System.out.println("================================");
		
		// 중간연산 조합
		Stream.of(5,3,0,7,9,1)
			.sorted()
			.limit(3)
			.forEach(e -> System.out.println(e));
		System.out.println("================================");
		
		Stream.of(5,3,0,7,9,1)
			.limit(3)
			.sorted()
			.forEach(e -> System.out.println(e));	
	}	
	
	public static void main(String[] args) {
		// 기본타입 int가 요소인 Stream
		
		// 생성방법1 : of static 메소드
		int r1 = IntStream.of(10,9,31,34,-1,3)
				.sum();
		System.out.println(r1);
		System.out.println("==========================");
		
		// 생성방법2 : Arrays.Stream static 메소드
		int r2 = Arrays.stream(new int[]) {10,9,31,34,-1,3})
			.sum();
		System.out.println(r2);
		System.out.println("==========================");
		
		// 생성방법3 : IntStream.range static 메소드
		//           : IntStream.rangeClosed  메소드
		
		int r3 = IntStream.range(1, 11)
			.sum();
		System.out.println(r3);
		System.out.println("==========================");
		
		int r4 = IntStream.rangeClosed(1, 10);
			.sum();
		System.out.println(r4);
		System.out.println("==========================");
		
		// 생성방법4 : IntStream.generate static 메소드
		IntStream.generate(()-> 1)
			.limit(5)
			.forEach(e -> System.out.println(e));
		IntStream.generate(() -> (int)(Math.random()* 45) + 1)
			.limit(5)
			.forEach(e -> System.out.println(e));
		System.out.println("============================");	
	}
	
	public static void main(String[] args) {
		// 1~10 까지 출력
			System.out.println("1~10 까지 출력");
			IntStream.rangeClosed(1, 10)
				.forEach((e) -> System.out.println(e));
			System.out.println("======================");
			
		// 1~100 까지 합 출력
			System.out.println("1~100 까지 합 출력");
			int s2 = IntStream.rangeClosed(1, 100)
				.sum();
			System.out.println(s2);
			System.out.println("==========================");
			
		// 1~100 까지의 수 중 홀 수의 합 출력
			System.out.println("1~100 까지의 수 중에 홀 수의 합 출력");
			int s3 = IntStream.rangeClosed(1, 100)
					.filter((e) -> e % 2 == 1)
					.sum();
			System.out.println(s3);
			System.out.println("==========================");
			
		// [5, 10, 20, 1, 6] 의 평균 구하기
			System.out.println("[5, 10, 20, 1, 6]의 평균 구하기");
			double s4 = IntStream.of(5,10,20,1,6)
					.average()
					.getAsDouble();
			System.out.println(s4);
			System.out.println("===========================");
			
		
			
		// 주사위 (1~6) 5번 던진 결과 출력
			System.out.println("주사위 (1~6) 5번 던진 결과 출력");
			IntStream.generate(() -> (int)(Math.random() * 6) + 1)
				.limit(5)
				.forEach(e -> System.out.println(e));
			System.out.println("================================");
			
		// 로또번호 (1~45) 6개 작은 수부터 출력 (중복없이)
			System.out.println("로또번호 (1~45) 6개 작은 수부터 출력 (중복없이)");
			IntStream.generate(()-> (int)(Math.random() * 45) +1)
				.distinct()
				.limit(6)
				.sorted()
				.forEach(e -> System.out.println(e)));
			
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
