package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class C07Mapping {
	public static void main(String[] args) {
		//	map 메소드 : 원본 원소의 타입을 다른 타입으로 변경한 스트림을 리턴
		int r1 = Stream.of("3", "6", "9", "1")
			.map((s) -> Integer.valueOf(s))
			.reduce((a, b) -> a + b)
			.get();
		
		System.out.println("스트링을 인트로 변환해서 합한 값");
		System.out.println(r1);
		System.out.println("=============");
		
		int r2 = Stream.of("3house", "2water", "1cup", "7pc", "9cpu")
			.map((s) -> s.substring(0, 1))
			.map((s) -> Integer.valueOf(s))
			.reduce((a, b) -> a + b)
			.get();
		System.out.println("앞글자스트링을 숫자로 변환해서 합한 값");
		System.out.println(r2);
		System.out.println("=============");
		
		
		int r3 = Stream.of("3house", "2water", "1cup", "7pc", "9cpu")
			.mapToInt((s) -> Integer.parseInt(s.substring(0, 1)))
			.sum();
		System.out.println("앞글자스트링을 숫자로 변환해서 합한 값");
			System.out.println(r3);
			System.out.println("=============");

	}
}

