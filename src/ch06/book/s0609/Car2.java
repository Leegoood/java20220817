package ch06.book.s0609;

public class Car2 {
	// 필드
	int speed;
	
	//생성자
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 10; i <=10; i +=10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/k)");
		}
	}
	
}
