package ch04.book;

public class C02IfElseExample {
	public static void main(String[] args) {
		int score = 95;
		
		if(score >= 90) { // 95 >= 90 true라서 실행되고 else문은 실행안됨.
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다.");
		}
	}
}
