package ch03.book;

public class C14CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); 
		boolean result2 = (num1 != num2); 
		boolean result3 = (num1 <= num2); 
		
		System.out.println("result1=" + result1); // 같으니까 true
		System.out.println("result2=" + result2); // 같지않다 false
		System.out.println("result3=" + result3); // 같거나 작지않다 true
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4=" + result4); // unicode 연산결과가 char2 가 크다 true
	}
}
