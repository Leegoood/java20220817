package ch06.book.s061302.package2;
import ch06.book.s061302.package1.A;

public class C {
	//필드
	A a1 = new A(true);  //  ok
//	A a2 = new A(1);     //  x   default 생성자 접근불가 (컴파일 에러)
//	A a3 = new A("문자열");  //  x   private 생성자 접근불가 (컴파일 에러)

}
