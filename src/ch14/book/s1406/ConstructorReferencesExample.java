package ch14.book.s1406;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member::new;  // Member::new; : 생성자 참조 (s1406Member Member(String id) 참조)
		Member member1 = function1.apply("angel"); // 매개값 1개
		
		BiFunction<String, String, Member> function2 = Member::new; // Member::new; : 생성자 참조 (s1406Member Member(String name, String id) 참조)
		Member member2 = function2.apply("신천사", "angel");  // 매개값 2개
	}
}
