package ch03.book.exercise;

public class C04Exercise {
	public static void main(String[] args) {
	 int lengthTop = 5;
	 int lengthBottom = 10;
	 int height = 7;
	 double area = ((double)((lengthTop + lengthBottom) * height) / 2); 
//	 double area = ((lengthTop + lengthBottom) * height / 2.0); // 더블 or 소수점숫자 integer 변경	 
	 System.out.println(area);
}
}
