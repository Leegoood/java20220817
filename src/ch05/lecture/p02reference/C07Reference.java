package ch05.lecture.p02reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9,8,7};
		System.out.println(a[0]); ///  a의 첫번째 9 출력 (첫번쨰)
		
		a = changeItems(a);   // changeItems(a) 함수 호출 
		
		System.out.println(a[0]);  //변경된 a의0번째 인티져 3출력 (세번째)
	}

	private static int[] changeItems(int[] arr) {
		System.out.println(arr[0]); // a의 첫번째 9 출력 (두번째)
		arr = new int[] {3, 4, 5};  // a 인티져 변경선언
		return arr; // 호출했던 a = changeItems(a);  곳으로 리턴
		
	}
}
