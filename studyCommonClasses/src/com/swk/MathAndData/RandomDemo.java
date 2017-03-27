package com.swk.MathAndData;
import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		
		/**
		 * 表示生成一个 [0,100)之间的一个伪随机数
		 */
		int ran = new Random().nextInt(100);
		System.out.println(ran);
	}
}
