package ch04.book;

public class C17Exercise {
	public static void main(String[] args) {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		System.out.println("for문 사용");
		
		System.out.println("sysout");
		System.out.println("hello");
		System.out.println("hi");
		System.out.print("엔터없이"); // 끝에 엔터없음
		System.out.println("정말?");
		System.out.println("또 다음줄");
		System.out.println(); // 새로운 줄 만 출력
		System.out.println();
		System.out.println("위에 새로운 줄 있니?");
		
		System.out.println("별표 찍기 print, println 로 분리");
		
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.println("중첩 for문 사용");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("중첩for문 사용");
		/*
		 *****
		 ****
		 ***
		 **
		 *  
		 */
		
		for (int o = 0 ; o < 5; o++) {       // o이  5보다 클때까지 o는 5번실행됨 (0,1,2,3,4)
			for (int q = 0; q < (5-o); q++){ // q는  5-o보다 클때까지 5번 실행됨(0,1,2,3,4)
				System.out.print("*");  // o이 한번실행될때 그안에서 q 는 5번실행되고  false가 날때 까지 진행 
			}
				System.out.println();
		}
		
	}
}



