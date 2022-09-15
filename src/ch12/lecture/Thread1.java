package ch12.lecture;

public class Thread1 {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		// 1. 동시에 똑같은 숫자가 나오고(start)
		/* t1.start();
		   t2.start(); */
		// 2. 번갈아가면서 나옴(run)
		t1.run();
		t2.run();
	}
}
