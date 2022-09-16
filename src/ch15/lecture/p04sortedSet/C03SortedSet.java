package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C03SortedSet {
	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<>();
		TreeSet<Integer> set2 = new TreeSet<>((a, b) ->b - a); //  본인 의도로 정렬을 바꿀 수 있다
		
		set1.add(200);
		set1.add(50);
		set1.add(10);
		
		set2.add(200);
		set2.add(50);
		set2.add(10);
		
		
		System.out.println(set1); // set1 treeSet작은순대로 출력
		System.out.println(set2); // ((a, b) ->b - a); //  본인 의도로 정렬을 바꿀 수 있다
		

	}
}
