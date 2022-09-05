package ch10.lecture.p04throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C04Throws {
	public static void main(String[] args) throws FileNotFoundException {
		method1();
	}
	
	private static void method1() throws FileNotFoundException {
		// 이코드를 try/catch 사용하지 않고
		// 컴파일 되도록 수정하세요.
		// f1 누르고  add throws declaration 클릭
		
		InputStream is = new FileInputStream("");
	}
}
