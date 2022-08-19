package ch03.lecture.p2binary;
// 책 92page 참고
public class C07Logical {
	public static void main(String[] args) {
		// 논리연산자
		// and : &&,&
		// or : ||, |
		// xor : ^
		// not : !
		// 피연산자 : boolean
		// 결과 : boolean
		
		// and : true && true => true
		//		true && false => false
		//		false && true => false
		//		false && false => false
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// or  : true || true => true
		// or  : true || false => true
		// or  : false || true => true
		// or  : false || false => false
		
		// sysout 으로 출력해보기
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		
		// xor : true ^ true => false (같으면 false)
		// xor : true ^ false => true (다르면 true)
		// xor : false ^ true => true (다르면 true)
		// xor : false ^ false => false (같으면 false)
		// sysout 으로 출력해보기
		
		 System.out.println(true ^ true);
		 System.out.println(true ^ false);
		 System.out.println(false ^ true);
		 System.out.println(false ^ false);
	}
}
