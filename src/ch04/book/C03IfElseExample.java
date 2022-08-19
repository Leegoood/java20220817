package ch04.book;

public class C03IfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score >= 90) { // 90점 보다 낮아서 false, 다음실행문 elseIf로 내려감
			System.out.println("점수가 100-90 입니다."); //실행안됨
			System.out.println("등급은 A 입니다.");  //실행안됨
		}else if(score >= 80){  // 80점 보다 낮아서 false , 다음실행문 elseIf로 내려감
			System.out.println("점수가 80-89 입니다."); //실행안됨
			System.out.println("등급은 B 입니다."); //실행안됨
		}else if(score >= 70){  // 70점과 같거나 높아서 true , 현 실행문에서 종료
			System.out.println("점수가 70-79 입니다."); // 실행
			System.out.println("등급은 C 입니다.");  //실행
		}else { // 위의 elseIf문에서 실행되서 여기는 실행 안됨
			System.out.println("점수가 70미만 입니다."); // 실행 안됨
			System.out.println("등급은 D 입니다."); //실행 안됨
		}
	}
}
