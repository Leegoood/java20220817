package ch05.lecture.p03String;

public class C03Null {
	public static void main(String[] args) {
		int[] a;
		String b;
		String c = "java";
		
		a = null; // 참조하는 객체가 없음
		b = null; // 참조하는 객체가 없음
		
		System.out.println(c.length());
		System.out.println(b.length());  // 콘솔에 NullPointerException 생성됨
	}
}