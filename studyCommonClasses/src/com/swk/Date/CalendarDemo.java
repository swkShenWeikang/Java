package com.swk.Date;

import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.SECOND;

import java.util.Calendar;
import java.util.Date;
public class CalendarDemo {
	
	public static void main(String[] args) {
		
		//获取日历
		Calendar c = Calendar.getInstance();
		
		/**
		 *  int get(int field)    返回给定日历字段的值。 
		 */
		int y = c.get(Calendar.YEAR);
		System.out.println(y);
		
		int m = c.get(Calendar.MONTH);//月的区间 [0,11]
		System.out.println(m + 1);
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int h = c.get(HOUR_OF_DAY);
		System.out.println(h);
		
		int mm = c.get(MINUTE);
		System.out.println(mm);
		
		int s = c.get(SECOND);
		System.out.println(s);
		
		/**
		 * Date  getTime();  Calendar --> Date
		 * 
		 * void  setTime(Date d);  Date --> Calendar 
		 */
		Date time = c.getTime();
		System.out.println(time);
		
		c.setTime(new Date(3,7,7));
		
		c.set(Calendar.YEAR, 100);
		System.out.println(c.get(Calendar.YEAR));
		
		
		/**
		 *  void set(int year, int month, int date, int hourOfDay, int minute, int second) 
		 */
		
		c.set(2012, 11,31,0,0,0);
		
		System.out.println(DateConvert.date2String(c.getTime(),null));
		
		/**
		 *  void add(int field, int amount)  
		 */
		
		c.add(Calendar.MONTH, 100);//月份 +1
		System.out.println(DateConvert.date2String(c.getTime(),null));
		
		
		//三天内   
		//2012 07 20 11:31:00 -- 2012 07 23 11:31:00
		//2012 07 21 00:00:00 -- 2012 07 23 23:59:59  应该用这种
		
		//结束时间		endTime
		c.setTime(new Date());
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE), 23, 59, 59);		
		System.out.println(c.getTime());
		
		//开始时间		beginTime
		c.add(Calendar.DATE, -3);
		c.add(Calendar.SECOND, 1);
		System.out.println(c.getTime());
		
		System.out.println("------------------");
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
	}
}


