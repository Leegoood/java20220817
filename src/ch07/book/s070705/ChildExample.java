package ch07.book.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent field2 = "data2";
		 parent.method3();
		 */
		Child child =(Child) parent;  // 강제 형변환(위험한 코드)
		child.field2 = "yyy"; // (가능)
		child.method3();      // (가능)
	}
}
