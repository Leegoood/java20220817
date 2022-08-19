package ch03.book;

public class C10AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPiece = apple *10;
		int number = 7;
		int temp = totalPiece - number;
		
		double result = temp/10.0;
		
		System.out.println("사과한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + " 조각이 남는다.");
	}
}
