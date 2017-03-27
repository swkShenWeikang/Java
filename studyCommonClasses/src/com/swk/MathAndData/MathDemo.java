package com.swk.MathAndData;

//import static java.lang.Math.PI;//静态导入PI
//import static java.lang.Math.*;//静态导入Math类里的静态成员
/**
* 静态导入:java5的新特性
* 		导入的是 类里面的静态成员
* import  static 
*/

public class MathDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		int a = 43;
		int b = 34;
		
		System.out.println(Math.max(a, b));//43
		System.out.println(Math.min(a, b));//34
		
		/**
		 * 随机数,  任意数
		 * static double random()    返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。 
		 */
		
		System.out.println((int)(Math.random() * 100));
	}
}
