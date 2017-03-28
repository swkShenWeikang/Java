package com.swk.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert {

	private static final String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss"; 
	private static SimpleDateFormat SDF = new SimpleDateFormat();
	
	public static boolean hasLength(String str){
		return str != null && !"".equals(str.trim());
	}
	
	/**
	 * 时间转化为字符串
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String date2String(Date date, String pattern){
		if(date != null){
			if(!hasLength(pattern)){
				pattern = DEFAULT_PATTERN;
			}
			
			SDF.applyPattern(pattern);
			return SDF.format(date);
		}

		return "";
	}
	
	/**
	 * 字符串转化为时间
	 * @param str
	 * @param pattern
	 * @return
	 */
	public static Date string2Date(String str, String pattern){
		if(hasLength(str)){
			
			if(!hasLength(pattern)){
				pattern = DEFAULT_PATTERN;
			}
			
			SDF.applyPattern(pattern);
			try {
				Date d = SDF.parse(str);
				return d;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
				
		return null;
	}
	
	public static void main(String[] args) {
		
		String pattern = "yyyy-MM-dd HH:mm:ss E";
		System.out.println(hasLength(pattern));
		
		Date d = new Date();
		String da = date2String(d, pattern);
		System.out.println(da);
		
		System.out.println(string2Date(da, pattern));
		
	}

}
