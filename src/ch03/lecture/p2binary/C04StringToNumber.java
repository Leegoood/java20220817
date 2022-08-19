package ch03.lecture.p2binary;

public class C04StringToNumber {
	public static void main(String[] args) {
		String a = "10";
		int b = 30;
		System.out.println(a+b); // "1030" 스트링과 숫자 조합이기 때문에 10+30=40 x  1030 ok
		
		int c = Integer.valueOf(a);
		System.out.println(c + b); //40
		
		String d = "3.14";
		double e = 9.8;
		
		System.out.println(d + e); // "3.149.8"
		
		double f = Double.valueOf(d);
		System.out.println(f+e); // 12.94000000000001
		System.out.println(Double.valueOf(d)+e); //12.94000000000001
		
		String g = "Inifinity";
		System.out.println(g + e); // "Infinity9.8"
		
		System.out.println(Double.valueOf(g) + e); //Infinity
		
		String h = "NaN";
		System.out.println(Double.valueOf(h) + e); // NaN
		
		// 기본 타입과 매치되는 참조타입
		// byte : Byte
		// short : Short
		// int : Integer
		// long : Long
		// float : Float
		// double : Double
		// char : Character
		// boolean : Boolean
		}
}
