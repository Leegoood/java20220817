package ch03.book;

public class C15StringEqualsExample {
public static void main(String[] args) {
			String strVar1 = "신민철";
			String strVar2 = "신민철";
			String strVar3 = new String("신민철");
			
			System.out.println(strVar1 == strVar2);
			System.out.println(strVar1 == strVar3); // 실수하는 경우가 많음. 스트링 비교할 때는 eqauls 를 쓸 것. 외워두면 좋음
			System.out.println();
			System.out.println(strVar1.equals(strVar2));
			System.out.println(strVar1.equals(strVar3));
}
}
