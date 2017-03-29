package com.swk.method;

class  Join implements Runnable{

	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("join --> " + i);
		}
	}
}

public class JoinDemo {
	
	public static void main(String[] args) throws Exception {
		
		Thread t =new Thread(new Join());
		
		for (int i = 0; i < 200; i++) {
			System.out.println("main----->" + i);
			if(i == 50){
				t.start();
			}
			if(i == 100){
				//主线程等待t执行完,才能执行
				//t强制运行,
				t.join();
			}
		}
	}
}
