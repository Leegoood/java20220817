package ch07.book.s0706;

public class D {
	public  void method() {
		A a = new A();				// (x)
		a.field = "value"; 			// (x)
		a.method();					// (x)
	}
}
