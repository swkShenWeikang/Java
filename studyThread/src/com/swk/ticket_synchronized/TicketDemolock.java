package com.swk.ticket_synchronized;

import java.util.concurrent.locks.ReentrantLock;

class MyRunnable3 implements Runnable {

	private final ReentrantLock lock = new ReentrantLock();
	private Integer num = 90;

	public void run() {
		for (int i = 0; i < 200; i++) {
			sale();
		}

	}

	public void sale() {//使用lock锁

		lock.lock();
		try {
			if (num > 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "卖出了第"
						+ num-- + "张票");
			}
		} finally {
			lock.unlock();
		}
	}

}

public class TicketDemolock {
	
	public static void main(String[] args) {

		Runnable target = new MyRunnable3();
		new Thread(target, "A").start();
		new Thread(target, "B").start();
		new Thread(target, "C").start();
	}
}
