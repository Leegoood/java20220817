package ch12.book.s1202;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();   // Toolkit부터 Exception e 까지 스레드 실행 내용
		for(int i = 0 ; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
