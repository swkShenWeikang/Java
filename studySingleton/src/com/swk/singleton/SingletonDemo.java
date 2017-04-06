package com.swk.singleton;

class Singleton1{
	private Singleton1(){}
	
	/**
	 * 饿汉式单例（线程安全的）
	 * 在类加载时，实例就已经初始化了
	 */
	private static Singleton1 instance = new Singleton1();
	
	public static Singleton1 getInstance(){
		return instance;
	}
	
}

class Singleton2{
	private Singleton2(){}
	
	/**
	 * 懒汉式单例（线程不安全）
	 * 在第一次需要用到时，才初始化实例
	 */
	private static Singleton2 instance;
	
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}

public class SingletonDemo {
	
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		System.out.println(s1 == s2);
		
		
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		System.out.println(s3 == s4);
	}
	
}
