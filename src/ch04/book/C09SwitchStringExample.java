package ch04.book;

public class C09SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";
		
		switch (position) {
		case "부장":
			System.out.println("700만원");  // "과장" 포지션이 아니기 때문에 내려감
			break;
		case "과장":
			System.out.println("500만원"); // "과장"  포지션이기 때문에 실행하고 디폴트는 실행안되고 다음실행문으로 넘어감.
			break;
			
		default:
			System.out.println("300만원");
		}
	}
}
