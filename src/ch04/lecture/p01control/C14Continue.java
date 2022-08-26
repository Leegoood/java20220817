package ch04.lecture.p01control;

public class C14Continue {
	public static void main(String[] args) {
		System.out.println(1);
		
		for(int i = 0; i < 5; i++) {
		System.out.println(2); // if 문을 만나 2가 5번반복
		
			if(true) {
				continue;
			}	
			System.out.println(3); // continue문을 만나 죽은코드블럭이 됨 
		}
		
		System.out.println(4);
		
		System.out.println(5);
	}
}
