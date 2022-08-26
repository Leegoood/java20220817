package ch06.book.s060602;

public class CarExample {
	public static void main(String[] args) {
		 // 객체 생성
		Car MyCar = new Car();
		
		// 필드값 읽기
		System.out.println("제작회사:" + MyCar.company);
		System.out.println("모델명:" + MyCar.model);
		System.out.println("색깔:" + MyCar.color);
		System.out.println("최고속도:" + MyCar.maxSpeed);
		System.out.println("현재속도:" + MyCar.speed);
		
		// 필드값 변경
		MyCar.speed = 60;
		System.out.println("수정된 속도" + MyCar.speed);
		
	}
}
