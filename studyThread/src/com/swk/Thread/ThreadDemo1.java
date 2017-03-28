package com.swk.Thread;

/**
 * 创建线程第一种方式:
 *		1. 	新建一个类,继承Thread
 *		2.  复写 run方法
 *		3.  创建一个线程对象
 *		4.  启动线程(线程对象.start())
 *
 */
class MyThread extends Thread{

	@Override
	public void run() {
		//线程体
		for(int i = 0; i < 200; i++){
			System.out.println("MyThread-->" + i);
		}
	}
	
}


public class ThreadDemo1 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 300; i++) {
			/**
			 * static Thread currentThread() 返回对当前正在执行的线程对象的引用。 
			 */
			String name = Thread.currentThread().getName();
			System.out.println(name + "-->" + i);
			//System.out.println("Main-->" + i);
			
			if(i == 100){
				//new MyThread().run();//这个不表示启动线程,仅仅表示调用对象的一个方法而已
				new MyThread().start();				
			}
		}
		
	}
}
