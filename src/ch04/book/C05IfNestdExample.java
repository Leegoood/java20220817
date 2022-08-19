package ch04.book;

public class C05IfNestdExample {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 20) + 81;  // (임의의 값 0부터 0.1미만 랜덤값 * 20) + 81을 int타입(정수타입)으로 
													 //형변환해서 0~100까지 정수숫자값만 입력됨. 
		
		System.out.println("점수" + score); 	     // 스트링 "점수"와 0~100까지의 랜덤 값을 출력하는 score 출력
		
		String grade;  								 // 스트링 grade 선언
		
		if(score >= 90) {  					         // if 조건문 실행  score가 90점이상이거나 높으면 true로 아래if문 출력
			if(score >= 95) { 
				grade = "A+";                        // 중첩if문 95점 같거나 이상이 나오면 A+
			}else {
				grade = "A";                         // 90~95점 나오면 A
			}
		} else {                                     // if(score >= 90) false 면 실행
			if (score >= 85) {
				grade = "B+";                        // 85점~89점 나오면 B+로 실행
			}else {
				grade = "B";                         // if(score >= 90) false -> if (score >= 85) false 면 "B"로 실행
			}
		}
	
		System.out.println("학점:" + grade);         // 스트링 "학점:" grade값 출력 
		
	                                                 // ("점수" + score);   화면에 나올 값 
		                                             // ("학점:" + grade);  화면에 나올 값 
	}
	
}