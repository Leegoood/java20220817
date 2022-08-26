package ch05.book;

public class C08StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";   // 신민철이라는 content를가진 인스턴스 주소가 생성됨.
		String strVar2 = "신민철";   // 신민철이라는 content를가진 인스턴스 주소가 생성됨.
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");  // true라서  else 실행 안되고 다음 실행문으로 넘어감.
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		
		String strVar3 = new String("신민철");  // new 연산자
		String strVar4 = new String("신민철");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		System.out.println("=============================");
		
		System.out.println(System.identityHashCode(strVar1));
		System.out.println(System.identityHashCode(strVar2));
		System.out.println(System.identityHashCode(strVar3));
		System.out.println(System.identityHashCode(strVar4));
		System.out.println("=============================");
		System.out.println("1,2번은 주소가 같고 3,4의 주소는 다르다.");
	}
}
