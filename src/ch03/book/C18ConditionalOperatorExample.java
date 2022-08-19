package ch03.book;

public class C18ConditionalOperatorExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');  //score = 85"점은"B(=grade(score>80))"등급입니다."
		System.out.println(score + "점은" + grade + "등급입니다.");  // 85점은B등급입니다.
	}
}
//삼항연산자 스코어가 85>90 false. A는 넘어가고, 85 > 80는 true.  C까지 안가고 B에서 실행종료.