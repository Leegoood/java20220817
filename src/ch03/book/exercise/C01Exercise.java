package ch03.book.exercise;

public class C01Exercise {
	public static void main(String[] args) {
	 int x = 10;
	 int y = 20;
	 int z = (++x) + (y--);
	 System.out.println(z);
	 
	 // ++피연산자: 다른연산을 수행하기 전에 피연산자의 값을 1증가
	 // --피연산자: 다른연산을 수행하기 전에 피연산자의 값을 1감소
	 // 피연산자++: 다른연산을 수행한 후에 피연산자의 값을 1증가
	 // 피연산자--: 다른연산을 수행한 후에 피연산자의 값을 1감소
}
}
