package com.swk.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	
	public static void main(String[] args) throws Exception {

		// 从 1970年 1月1日  00:00开始计算的毫秒数
		System.out.println(System.currentTimeMillis());

		Date d = new Date();
		System.out.println(d);

		d = new Date(System.currentTimeMillis());// 根据你自己写的毫秒数来得到这个毫秒数表示的时间
		System.out.println(d);

		/**
		 * boolean after(Date when) 测试此日期是否在指定日期之后。 
		 * boolean before(Date when)测试此日期是否在指定日期之前。
		 **/
		
		//java.text.SimpleDateFormat用来格式化日期
		
		/**
		 * 把时间格式应用到  时间格式化对象上
		 * 	1.SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		 * 用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
		 * 		
		 *  2.SimpleDateFormat sdf = new SimpleDateFormat();
		 *  	sdf.applyPattern(pattern);    将给定模式字符串应用于此日期格式。 
		 */
		SimpleDateFormat sdf = new SimpleDateFormat();
		String pattern = "yyyy-MM-dd HH:mm:ss E";//时间的格式模板
		
		sdf.applyPattern(pattern);
		
		// String format(Date date) 将一个 Date 格式化为日期/时间字符串。
		//Date  -->  String 时间
		String dd = sdf.format(new Date());//日期字符串
		System.out.println(dd);
		
		// Date parse(String source)      从给定字符串的开始解析文本，以生成一个日期。 
		//解析日期字符串,  String时间  --> Date
		sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date ddd = sdf.parse(dd);
		System.out.println(ddd);
	}
}
