package ch09.lecture.p02lambda;
// 람다 표현식으로 코드를 줄여 나갈 수 있다.
public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 o1 = (String s) -> System.out.println(s);
		
		o1.method("Hello");
		o1.method("Java");
		
		MyInterface3 o2 = (s) -> System.out.println(s.repeat(2));
		
		o2.method("top");
		o2.method("gun");
		
		MyInterface3 o3 = s -> System.out.println(s.repeat(3));
		
		o3.method("coyote");
		o3.method("bob");
 	}
}

interface MyInterface3{
	void method(String s);
}
