package ch15.lecture.p04sortedSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class C02SortedSet {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>(); // SortedSet : 작은것부터 정렬해서 출력
		
		set.add(300);
		set.add(100);
		set.add(99);
		set.add(10000);
		set.add(-1);
		
		System.out.println(set);  // 작은값부터 정렬해서 출력함
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println();
		System.out.println(set.headSet(100));
		System.out.println(set.tailSet(500));
		System.out.println();
		
		NavigableSet<Integer> nset = (NavigableSet<Integer>) set;
		System.out.println(nset.lower(99));
		System.out.println(nset.floor(99));
		System.out.println(nset.higher(100));
		System.out.println(nset.ceiling(100));
	}
}
