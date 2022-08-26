package ch05.lecture.p03String;

public class C02New {
	public static void main(String[] args) {
		// new 연산자 : 새 인스턴스(객체)의 참조값을 연산결과로 낸다
		String str1 = new String("java");
		String str2 = new String("java");
		
		
		String str3 = "java";
		// new  연산자 생략하고 string literal
		// new  연산자 생략하고 string literal을 작성하면 이미 있는
		// 참조값 활용 
		
		
		String str4 = "java";   // <= str3 이랑 동일한 객체주소를 가지고 있음.
		
		
	
		String str5 = new String("java");
		
	
		String str6 = "java";
		
		System.out.println(System.identityHashCode(str1));
		System.out.println("===새로운 객체주소JAVA 생성===");
		System.out.println(System.identityHashCode(str2));
		System.out.println("===새로운 객체주소JAVA 생성===");
		System.out.println(System.identityHashCode(str3));
		System.out.println("===새로운 객체주소JAVA 생성===");
		System.out.println(System.identityHashCode(str4));
		System.out.println("===str3 객체주소와 같은 JAVA 생성===");
		System.out.println(System.identityHashCode(str5));
		System.out.println("===새로운 객체주소JAVA 생성===");
		System.out.println(System.identityHashCode(str6));
		System.out.println("===str3 객체주소JAVA 생성===");
	}
}
