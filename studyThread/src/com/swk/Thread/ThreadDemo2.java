package com.swk.Thread;

/**
 * 创建线程第二种方式:
 * 
 * 1.定义一个类MyThread实现 Runnable接口 
 * 2.实现run方法 
 * 3.线程对象的创建, new Thread(Runnable对象)
 * 4.依然是调用 线程类的start方法;
 * 
 */
class MyThread2 implements Runnable {
	@Override
	public void run() {
		// 线程体
		for (int i = 0; i < 300; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name+"-->" + i);
		}
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {

		for (int i = 0; i < 200; i++) {

			System.out.println("main-->" +i);
			if (i == 60) {
				new Thread(new MyThread2(),"AAA").start();
			}
		}
		
		System.out.println("------------------------------->");
		
		//用匿名对象创建线程
		new Thread(new Runnable(){
			@Override
			public void run() {
				for (int i = 0; i <50; i++) {
					System.out.println("匿名对象-->" + i);
				}
			}
		},"OOXX").start();
	}
}
