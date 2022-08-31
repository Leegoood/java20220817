package ch07.book.exercise.p07;

public class Q3SnowTireExample {
	public static void main(String[] args) {
		Q2SnowTire q2SnowTire = new Q2SnowTire();
		Q1Tire q1Tire = q2SnowTire;
		
		q2SnowTire.run();
		q1Tire.run();
		
	}
}
// 타이어는 스노우타이어의 부모
// 스노우타이어는 타이어에 상속됨
// 스노우 타이어는 상속값을 재정의 함
// 