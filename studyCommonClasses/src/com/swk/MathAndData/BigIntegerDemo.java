package com.swk.MathAndData;
import java.math.BigInteger;


public class BigIntegerDemo {
	public static void main(String[] args) {
		
		long max = Long.MAX_VALUE;//9223372036854775807
		
		
		/**
		 * BigInteger(String val) 

		 */
		
		BigInteger b1 = new BigInteger(max+"");
		BigInteger b2 = new BigInteger(3+"");
		
		System.out.println("求和" + b1.add(b2));
		System.out.println("求差" + b1.subtract(b2));
		System.out.println("求积" + b1.multiply(b2));
		System.out.println("求商" + b1.divide(b2));
		BigInteger[] res = b1.divideAndRemainder(b2);
		System.out.println("商-->" + res[0] + "余数-->" + res[1]);
		
		System.out.println("--" + max);
	}
}
