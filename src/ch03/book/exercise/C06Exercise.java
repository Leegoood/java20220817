package ch03.book.exercise;

public class C06Exercise {
	public static void main(String[] args) {
		 double x = 5.0;
		 double y = 0.0;
		 
		 double z = x % y; // 연산결과값은 NaN 이 됨. 그래서 z 도 NaN
		 
		 if(Double.isNaN(z)) {   // z 가 NaN인지 확인하는 Double.
			 System.out.println("0.0으로 나눌 수 없습니다.");
		 }else {
			 double result = z + 10;
			 System.out.println("결과" + result);
		 }
	}
}
