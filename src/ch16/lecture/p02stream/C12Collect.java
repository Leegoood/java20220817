package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1, 100)
			.parallel()
			.filter(n -> n % 2 == 0)
			.collect(() -> new ArrayList<>(),
					(r, e) -> r.add(e),(r1,r2) -> r1.addAll(r2));
		System.out.println(list1);
	}
}
// r 은 ArrayList 만든것
// e 는 원소
// r.add(e),(r1, r2) 는 r의 병렬된 r1,r2가 원소e 에 들어가는 것
// r1.addAll(r2) 는 병렬된 r1 r2를 r1에 옮기는거