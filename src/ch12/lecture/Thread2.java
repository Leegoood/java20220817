package ch12.lecture;

public class Thread2 {
	public static void main(String[] args) {
		// Runnable 인터페이스 객체 생성
		RunnableTest Obj1 = new RunnableTest();
		RunnableTest Obj2 = new RunnableTest();
		// Runnable 객체를 매개변수로 하여 스레드 객체 th 생성
		Thread th1 = new Thread(Obj1);
		Thread th2 = new Thread(Obj2);
		
		th1.start();
		th2.start();
	}
}
