package ch06.lecture.p04static;

public class C01Static {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1("coyote");
		o1.printname();
		
		MyClass1 o2 = new MyClass1("pheonix");
		o2.printname();
		
		o1.company = "topgun";
		System.out.println(o1.company);
		System.out.println(o1.name);
		
		o1.company = "bottomgun";
		System.out.println(o1.company);
		System.out.println(o2.company);
		
		o1.name = "maverick";	
		System.out.println(o1.name);
		System.out.println(o2.name);
		
		MyClass1.company = "middlegun";
		System.out.println(o1.company);
		System.out.println(o2.company);
		System.out.println(MyClass1.company);
		
		MyClass1.printCompany();
		o1.printCompany();
		}
}
