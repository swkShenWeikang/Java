package com.swk.MathAndData;
import java.math.BigDecimal;

/**
 * 此构造方法的结果有一定的不可预知性。
 * 有人可能认为在 Java 中写入 new BigDecimal(0.1) 所创建的 BigDecimal 正好等于 0.1（非标度值 1，其标度为 1），
 * 但是它实际上等于 0.1000000000000000055511151231257827021181583404541015625。
 * 这是因为 0.1 无法准确地表示为 double（或者说对于该情况，不能表示为任何有限长度的二进制小数）。
 * 这样，传入 到构造方法的值不会正好等于 0.1（虽然表面上等于该值）。 
 * 
 * 另一方面，String 构造方法是完全可预知的：
 * 写入 new BigDecimal("0.1") 将创建一个 BigDecimal，它正好 等于预期的 0.1。
 * 因此，比较而言，通常建议优先使用 String 构造方法。 
 *
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		
		/**
		 * BigDecimal(double val)   不精确
		 * 
		 * BigDecimal(String val) 	精确
		 */
		
		double d1 = 2.5000;
		double d2= 1.000000000000001;
		
		System.out.println("+  " + (d1 + d2));
		System.out.println("-  " + (d1 - d2));
		System.out.println("*  " + (d1 * d2));
		System.out.println("/  " + (d1 / d2));
		
		System.out.println("-----------------------");
		show1(d1,d2);
		System.out.println("-----------------------");
		show2(d1,d2);
	}
	
	public static void show1(double d1,double d2){
		BigDecimal b1  = new BigDecimal(d1);
		BigDecimal b2 = new BigDecimal(d2);
		
		System.out.println("+  " + b1.add(b2));
		System.out.println("-  " + b1.subtract(b2));
		System.out.println("*  " + b1.multiply(b2));
		/**
		 * 如果无法表示准确的商值（因为它有无穷的十进制扩展），则抛出 ArithmeticException。
		 */
		try{
			System.out.println("/  " + b1.divide(b2));
		}catch(Exception e){
			//e.printStackTrace();
		}
	}
	
	/**
	 * 以String精确构造
	 * @param d1
	 * @param d2
	 */
	public static void show2(double d1,double d2){
		BigDecimal b1  = new BigDecimal(d1+"");
		BigDecimal b2 = new BigDecimal(d2+"");
		
		System.out.println("+  " + b1.add(b2));
		System.out.println("-  " + b1.subtract(b2));
		System.out.println("*  " + b1.multiply(b2));
		/**
		 * 如果无法表示准确的商值（因为它有无穷的十进制扩展），则抛出 ArithmeticException。
		 */
		try {
			System.out.println("/  " + b1.divide(b2));
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
}
