package ch03.book.exercise;

public class C05Exercise {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println((x > 7) && (y <= 5) );  // -----(true) 두개다 true여야 true. 10>7 true,  y <= 5 true 그래서 true
		System.out.println((x % 3 == 2) || (y % 2 != 1)); // -----(false) 둘중하나라도 true여야 true 10/3 의 나머지는 1이고, 5/2의 나머지는 1이기때문에 둘다 false
	}
}
