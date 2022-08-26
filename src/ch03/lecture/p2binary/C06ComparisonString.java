package ch03.lecture.p2binary;

public class C06ComparisonString {

	public static void main(String[] args) {
		// String 끼리 비교 크기 연산 안됨(<, <=, >, >=) 자바스크립트는 됨.
		String a = "hello";
		String b = "hi";
		
//		System.out.println(a < b); //x
		
		// String 끼리 같은지 비교 연산
		String c = "java";
		String d = "java";
		String e = "ja";
		String f = "va";
		String g = e + f; //"java"
		
		System.out.println(c);
		System.out.println(g);
		
		System.out.println(c == d); //true
		System.out.println(c == g); //false
		
		
		System.out.println(c.equals(d)); //true
		System.out.println(c.equals(g)); //true
		System.out.println(g);
		
	}

}
