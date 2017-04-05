package com.swk.ticket_synchronized;

class MyRunnable2 implements Runnable {

	private Integer num = 80;

	public void run() {
		for (int i = 0; i < 200; i++) {
			sale();
		}

	}

	public synchronized void sale() {//同步方法
		if (num > 0) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "卖出了第" + num--
					+ "张票");
		}
	}

}

public class TicketDemoSynchronized2 {
	
	public static void main(String[] args) {

		Runnable target = new MyRunnable2();
		new Thread(target, "A").start();
		new Thread(target, "B").start();
		new Thread(target, "C").start();
	}
}
