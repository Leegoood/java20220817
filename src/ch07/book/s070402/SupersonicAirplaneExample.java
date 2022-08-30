package ch07.book.s070402;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
