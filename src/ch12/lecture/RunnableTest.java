package ch12.lecture;

public class RunnableTest implements Runnable{
	// Runnable 인터페이스의 run()오버라이딩
		public void run() {
			try // 인터럽트 예외처리
			{
				for(int i = 0; i < 10; i++) {
					//대기시간 0.2초
					Thread.sleep(200);
					System.out.println("스레드 : " + i);
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
}
