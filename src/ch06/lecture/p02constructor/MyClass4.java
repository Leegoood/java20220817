package ch06.lecture.p02constructor;

public class MyClass4 {
	//fields
	String name;
	int age;
	
	// constuctor
	
	public MyClass4(String name , int age) {
		// this. : 앞으로 만들어질 객체의 참조값
		this.name = name; // this . 을 붙혀야 field 를 가리킴
		this.age  = age; // this . 을 붙혀야 field 를 가리킴
	}
}
