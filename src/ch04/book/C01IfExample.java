package ch04.book;

public class C01IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score < 90)  // false
			System.out.println("점수가 90보다 작습니다"); // 중괄호블록이 없어 12라인까지만 영향을 미치기때문에 
			System.out.println("등급은 B입니다."); // 13라인은 들여쓰기만 되었고 if문과는 아무 관련이 없다.
		
	}
}
