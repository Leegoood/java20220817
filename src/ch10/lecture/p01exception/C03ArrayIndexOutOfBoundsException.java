package ch10.lecture.p01exception;

public class C03ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		System.out.println(args.length);
		
		if(args.length > 3) {
		System.out.println(args[0]); // maverick
		System.out.println(args[1]); // goose
		System.out.println(args[2]); // rooster
		System.out.println(args[3]); // ArrayIndexOutOfBoundsException
		}
		
		System.out.println("프로그램 종료");
	}
}
