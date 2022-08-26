package ch04.book;


public class C24Exercise4 {
	public static void main(String[] args) {
		int sum = 0;
		do {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + "," + num2 + ")");
			sum = num1 + num2;
		} while (sum != 5) ;
				System.out.println();
			
		
		
		
	}
}