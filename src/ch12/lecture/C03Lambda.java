package ch12.lecture;

import java.awt.Toolkit;

public class C03Lambda {
	public static void main(String[] args) {
		Thread t1 = new Thread(() ->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}
}
