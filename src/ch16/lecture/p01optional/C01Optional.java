package ch16.lecture.p01optional;

import java.util.Optional;

public class C01Optional {
	public static void main(String[] args) {
		Optional<String> obj1 = Optional.empty();
		Optional<String> obj2 = Optional.of("java");
		
		System.out.println(obj1.isEmpty()); // true
		System.out.println(obj2.isEmpty()); // false  "java"스트링이 있음
		
		System.out.println(obj1.isPresent()); // false 
		System.out.println(obj2.isPresent()); // true
		
		String str2 = obj2.get();
		System.out.println(str2);
		
//		String str1 = obj1.get();   // Exception
//		System.out.println(str1);   // Exception
		
		String str1 = obj1.orElse("empty string");
		System.out.println(str1);  // empty string
		System.out.println(obj2.orElse("empty string"));  // java
	}
}
