package ch10.lecture.p04throws;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06Throws {
	public static void main(String[] args) throws IOException { // 다형성 때문에 상위익셉션은 쓸 수 없다
		method1();
	}
	private static void method1() throws IOException {
		FileReader a = new FileReader("a");
	}
}
