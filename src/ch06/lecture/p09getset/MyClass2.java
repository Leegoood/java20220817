package ch06.lecture.p09getset;

public class MyClass2 {
	// field는 특별한 이유가 없으면 private
	private String name;
	private int age;
	boolean alive;
	
	// 대신 getter, setter method 공개(public)
	// boolean type getter 는 is 로 작성
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
