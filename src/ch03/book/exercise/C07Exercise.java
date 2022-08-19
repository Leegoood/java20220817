package ch03.book.exercise;

public class C07Exercise {
	public static void main(String[] args) {
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나" ;
		System.out.println(result); 
		
		// score는 85, 85 > 90 false 이지만 ! 부정연산자로 인해 true가 됨. 따라서 "가"연산자 출력.
		
	}
}
