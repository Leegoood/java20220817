package ch16.lecture.p02stream;


import java.util.stream.Stream;

public class C04IntermediateOperation {
	public static void main(String[] args) {
		
		// 중간 연산(메소드) : 리턴 타입 -> xxxStream
		
		// limit : element 갯수 제한
		
		Integer r1 = Stream.of(3, 4, 5, 9, -1, 10, 11)
				.limit(5)
				.max((x, y) -> x - y)
				.get();
		
		System.out.println(r1);
		
		System.out.println("===================");
		
		// skip : element 몇 개 무시
		Integer r2 = Stream.of(3, 4, 5 ,9 , 10, 11)
				.skip(2)
				.min((x ,y) -> x - y)
				.get();
		System.out.println(r2);
		System.out.println("===================");
		
		// filter : predicate에서 true 나온 것만 추림
		Integer r3 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e % 2 == 0)
				.reduce((x, y) -> x + y)
				.get();
		
		System.out.println(r3);
		
		System.out.println("===================");
		
		// filter : predicate에서 true 나온 것만 추림
		Integer r4 = Stream.of(3, 4, 5, 6, 7)
				.filter((e) -> e % 2 == 1 ) // 홀수만 나오게 .filter((e) -> e % 2 != 1 ) 도 가능
				.reduce((x, y) -> x + y)
				.get();
		
		System.out.println(r4);  // 15 출력되게
		
		System.out.println("===================");
		
		// distinct : 중복 제거
		Integer r5 = Stream.of(3, 3, 4, 4, 5, 5, 5, 6, 7)
			.distinct()  // 중복 제거
			.reduce((x, y) -> x + y)
			.get();
		System.out.println(r5); //  3 + 4 + 5+ 6 +7 = 25
		System.out.println("===================");
		
		// sorted : 정렬한 스트림 리턴
		Stream.of(5, 3, 0 , 7, 9 ,1)
			.sorted() // 0,1,3,5,7,9
			.forEach(e -> System.out.println(e));
		System.out.println("===================");
		
		// 중간연산 조합
		Stream.of(5,3,0,7,9,1)
		.sorted()  // 0, 1, 3, 5, 7, 9
		.limit(3)  // 0, 1, 3
			.forEach(e -> System.out.println(e));  // 0 ,1 ,3 출력
		System.out.println("==================="); // 한 줄씩 0, 1, 3 출력
		
		Stream.of(5,3,0,7,9,1)
		.limit(3)  // 5 , 3, 0 
		.sorted()  // 0, 3, 5
			.forEach(e -> System.out.println(e)); // 한줄씩 0, 3, 5 출력
		
		
	}
}
