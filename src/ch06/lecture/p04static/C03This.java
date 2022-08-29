package ch06.lecture.p04static;

public class C03This {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3("maverick");
		
		System.out.println(o1.name);
		o1.printName(); // "maverick"
	}
}
