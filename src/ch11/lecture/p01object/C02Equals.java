package ch11.lecture.p01object;

public class C02Equals {
	public static void main(String[] args) {
		System.out.println("Object equals()");
		
		Object o1 = new Object();   // o2와 참조값이 다름
		Object o2 = new Object();   // o1과 참조값이 다름
		
		System.out.println(o1.equals(o2)); // false
		System.out.println(o2.equals(o1)); // false 
		System.out.println(o1.equals(o1)); // true
		System.out.println(o2.equals(o2)); // true
		
		System.out.println("String equals()");
		
		Object o3 = new String("topgun");
		Object o4 = new String("topgun");
		
		System.out.println(o3.equals(o4)); // true
		System.out.println(o4.equals(o3)); // true
		System.out.println(o3.equals(o3)); // true
		System.out.println(o4.equals(o4)); // true
		
		System.out.println("String ==");
		System.out.println(o3 == o4); // false
	}
}
