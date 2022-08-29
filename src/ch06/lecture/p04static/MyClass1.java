package ch06.lecture.p04static;

public class MyClass1 {
	// non static
	// instance field
	String name;
	
	// static field
	// class field
	static String company;
	
	// 생성자 constructor
	public MyClass1(String name) {
		this.name = name;
	}
	
	// non static
	void printname() {
		System.out.println(name);
	}
	
	// non static method
	// (instance) method
	void printName() {
		System.out.println(name);
		
	}
	
	//static method
	//class method
	static void printCompany() {
		System.out.println(company);
	}
	
	
	
	
}
