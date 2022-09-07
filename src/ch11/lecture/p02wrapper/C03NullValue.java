package ch11.lecture.p02wrapper;

public class C03NullValue {
	public static void main(String[] args) {
		int a = 3;
		Integer b = 3;
		
//		int d = null;  
		Integer c = null;
		
		int e = c; // runtime exception 발생
		
		System.out.println("프로그램 실행 이어감");
	}
}
