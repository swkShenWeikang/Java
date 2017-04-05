package com.swk.ATM_synchronized;

class Singleton {
	private Singleton() {
	}

	private static Singleton instance;

	/**
	 * 此时同步监听对象是 Singleton.class
	 */
	/**
	 * public synchronized static Singleton getInstance(){ 
	 * 	   if(instance == null){
	 * 		   instance = new Singleton(); 
	 *     } 
	 *     return instance; 
	 * }
	 */
	
	
	public static Singleton getInstance() {
		if (instance == null) {//多一次判断是为了提高性能
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
public class SingletonDemo {

}
