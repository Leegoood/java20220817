package ch12.lecture;

public class ThreadTest extends Thread {
	public void run() {
		// 인터럽트 됬을 때 예외처리
		try {
			for(int i = 0; i < 10; i++) {
				// 스레드 0.5초동안 대기
				Thread.sleep(500);
				System.out.println("Thread : " + i);
			}
		}	catch(InterruptedException e) {
				System.out.println(e);
			}
	}
}

