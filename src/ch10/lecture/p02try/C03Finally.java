package ch10.lecture.p02try;

public class C03Finally {
	public static void main(String[] args) {
		try {
			int a = 3 / 3;
			
			if(a == 1) {
				return;
			}
		}catch (ArithmeticException e) {
			System.out.println("exception!!!!!");
		}finally {
			System.out.println("@@@@@finally");  // 무조건 실행되는 finally코드
		}
		System.out.println("continue.....");
	}
}
