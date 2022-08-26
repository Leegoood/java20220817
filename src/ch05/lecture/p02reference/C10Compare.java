package ch05.lecture.p02reference;

import java.util.Arrays;

public class C10Compare {
	// 그림 : 05 참조타입비교.png
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // true  값 자체안에 a ,b = 3 이 들어가있음 .
		
		int[] c = new int[] {3, 4, 5}; 
		int[] d = new int[]{3, 4, 5};
		
		System.out.println(c == d); // false why?? 찍힌 heap 주소가 다르기 때문
		// content 비교 => true
		System.out.println(Arrays.equals(c,d)); // true
		
		
		int[] e = c;
		e[0] = 33;
		System.out.println(c[0]); //33
		
		System.out.println(e == c);  // true  why? 찍힌 heap 주소가 같기 때문
		System.out.println(Arrays.equals(c,d));  //false
	}
}
