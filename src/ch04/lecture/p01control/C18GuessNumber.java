package ch04.lecture.p01control;

import java.util.Scanner;

public class C18GuessNumber {
	public static void main(String[] args) {
		// 컴퓨터 1~100 random
		int d = (int) (Math.random()*100) + 1 ;
	
		//System.out.print(d);
		
		Scanner scanner = new Scanner(System.in);
		// ctrl + shift + o = import 추가
		
		while(true) {
			System.out.print("1~100 입력해서 맞춰보세요.");
			int user = scanner.nextInt();
		
			if (user == d) {
				System.out.println("맞췄습니다..");
				break;
			}else if(user < d) {
				System.out.println("정답보다 큰 수를 입력해보세요");
			}
			else {
				System.out.println("정답보다 작은 수를 입력해보세요");
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
