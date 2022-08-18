package ch03.book;

public class C05CharOperatorExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		// char c3 = c2 + 1; //컴파일 에러 int 가 char 보다 크기 때문에 에러가 남.
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		//System.out.println("c3:" + c3);
	}
}
