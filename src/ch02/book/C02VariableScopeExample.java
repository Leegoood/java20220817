package ch02.book;

public class C02VariableScopeExample {
public static void main(String[] args) {
	int v1 = 15;
	if(v1 > 10) {
		int v2 = v1 - 10;
		System.out.println(v2); // v2 변수 선언된 블럭 안이기 때문에 출력 가능.
    }
//	int v3 = v1 + v2 + 5; // v2변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	
}
}
