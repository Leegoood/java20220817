package ch15.book.s1504;

import java.util.*;


public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");  		// 아이디와 비밀번호를 미리 저장시킨다.
		map.put("summer", "123");		// 아이디와 비밀번호를 미리 저장시킨다.
		map.put("fall", "1234");		// 아이디와 비밀번호를 미리 저장시킨다.
		map.put("winter", "12345");		// 아이디와 비밀번호를 미리 저장시킨다.
		
		Scanner scanner = new Scanner(System.in); // 키보드로부터 입력된 내용을 받기위해 생성한다.
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id = scanner.nextLine(); // 키보드로 입력한 아이디를 읽는다.
			
			System.out.println(" 비밀번호 : ");
			String password = scanner.nextLine(); // 키보드로 입력한 비밀번호를 읽는다.
			System.out.println();
			
			if(map.containsKey(id)) { // 아이디인 키가 존재하는지 확인한다.
				if(map.get(id).equals(password)) { // 비밀번호를 비교한다.
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("입력하신 아이디가 존재하지 않습니다.");
				}
			}
			
		}
	}
}
