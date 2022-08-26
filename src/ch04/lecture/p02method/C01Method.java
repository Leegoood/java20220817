package ch04.lecture.p02method;

public class C01Method {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		// call method(invoke method)
		method1();
		method1();
		method2();
		
		
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
	}
	// 메소드 (method)
	public static void method1() {
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	
	public static void method2() {
		System.out.println("졸리다");
		
	}
	//method2 메소트 작성하고 main에서 method2 호출하는 코드 작성
}
