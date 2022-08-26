package ch04.lecture.p02method;

public class C04Parameter {
	public static void main(String[] args) {
		// 여러줄이 출력되도록 파라미터과 아큐먼트
		printTriangle(5);
		printTriangle(10);
		printTriangle(7);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printTriangle(int line) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
