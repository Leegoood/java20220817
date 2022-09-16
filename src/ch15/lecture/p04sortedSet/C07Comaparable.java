package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C07Comaparable {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("java");
		set.add("css"); 
		set.add("html");
		set.add("CSS"); // 대문자부터 출력
		set.add("JAVA");
		
		System.out.println(set);
	}
}
