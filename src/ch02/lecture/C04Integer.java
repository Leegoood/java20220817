package ch02.lecture;

public class C04Integer {
public static void main(String[] args) {
	/// 정수 : byte(1), short(2), int(4), long(8)
	
	// 1byte == 8bit(0000 0000)
	// 0~ 255(1111 1111)
	// -128 ~127 (byte 범위)
	
	byte a = 0;
	byte b = 127;
	byte c = -128;
//	byte d = 128;
//	byte e = 129;
	
	// short (2bytes)
	// -32,768 ~ 32767
	short f = -32768;
	short g = 32767;
//	short h = 32768;
//	short i = -32769;
	
	// int (4bytes)
	// -2,147,483,648 ~ 2,147,483,647
	int j = -2147483648;
	int k = 2147483647;
//	int l = -300000000;
//	int m = 3000000000;
	
	// long (8bytes)
	// 매우큰값
	long  o = 300000000;
	long  p = -300000000;
	
	// 정수 literal 작성시 주의 할 점
	// 정수 literal은 int로 취급
	// 범위를 넘어갈땐 long으로 표시(대문자 L ex (long  p = -300000000L;)
	long q = 2_000_000_000;
	long r = 21_0000_0000;
	
	// 연산시 주의 overflow주의
	int s = 2147483647;
	
	int t = s + 1; //2147483648 x 
	System.out.println(t);
	
}
}
