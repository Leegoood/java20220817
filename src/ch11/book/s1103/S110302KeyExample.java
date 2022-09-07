package ch11.book.s1103;

import java.util.HashMap;

public class S110302KeyExample {
	public static void main(String[] args) {
		//S110302Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<S110302Key, String> hashMap = new HashMap<S110302Key, String>(); 
		
		// 식별키 "new S110302Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new S110302Key(1)," 홍길동");
		
		// 식별키 "new S110302Key(1)" 로 "홍길동"을 읽어옴
		String value = hashMap.get(new S110302Key(1));
		System.out.println(value);
	}
}
