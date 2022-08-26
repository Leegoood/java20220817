package ch05.book.exercise;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[]scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("=========================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("=========================");
			System.out.print("<선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {	
				//학생수 입력 작성위치
				System.out.print("학생수 입력.");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				//작성위치
				System.out.println("학생 점수를 입력.");
				for(int i = 0; i < scores.length; i++) {
					System.out.print((i + 1) + "번의 점수는?");
					scores[i] = scanner.nextInt();
				}
			}else if(selectNo == 3) {
				//작성위치
				System.out.println("학생의 점수를 출력합니다.");
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores["+ i +"]:" + scores[i]);
				}
				System.out.println();
			}else if(selectNo == 4) {
				//작성위치
				int max = 0;
				int sum = 0;
				double avg = 0;
				
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				
				avg = sum / (double) scores.length;
				
				
				System.out.println("최고 점수는:" + max);
				System.out.println("평균 점수는:" + avg);
			}else if(selectNo == 5) {
				run = false;
			}
			
		}		
		System.out.println("프로그램 종료");			
	}
}
