package com.swk.ticket;


/**
 * 
 *	A extends Thread：
 *		简单
 *		不能再继承其他类了(Java单继承)
 *		同份资源不共享
 *	A implements Runnable:(推荐)
 *		多个线程共享一个目标资源，适合多线程处理同一份资源。
 *		该类还可以继承其他类，也可以实现其他接口。
 */
class Ticket2 extends Object implements Runnable{

	int num = 50;
	
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			if(num >0) {
				System.out.println(Thread.currentThread().getName()+"卖出第" +num-- +"张");
			}
		}
	}
}


public class TicketDemo2 {
	
	public static void main(String[] args) {
		
		Runnable target = new Ticket2();
		new Thread(target,"A").start();
		new Thread(target,"B").start();
		new Thread(target,"C").start();
	}
}
