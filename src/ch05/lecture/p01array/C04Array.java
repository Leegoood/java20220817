package ch05.lecture.p01array;

public class C04Array {
	public static void main(String[] args) {
		// 참조타입 거의== 객체
		int[]arr = {9, 8, 7};
		
		// length 속성(attribute 혹은 field(대부분 이걸씀) 혹은 property)
		System.out.println(arr.length);
		
		int[]arr2 = { 1, 2, 3, 4, 5};
		System.out.println(arr2.length);
		
		int[]arr3 = {};
		System.out.println(arr3.length);
		
		System.out.println(arr[arr.length -1]);
		System.out.println(arr2[arr2.length -1]);
//		System.out.println(arr3[arr3.length -1]); // x
		
		System.out.println("프로그램 실행");
		
	}
}
