package com.swk.String;

import java.util.Arrays;

public class StringDemo2 {
	
	/**
	 * String常用方法测试
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * char charAt(int index) 返回指定索引处的 char 值。
		 */
		String s = "abcdef";
		System.out.println(s.charAt(1));
		
		
		/**
		 * int compareTo(String anotherString) 按字典顺序比较两个字符串。
		 * 
		 * int compareToIgnoreCase(String str)
		 */
		System.out.println("A".compareToIgnoreCase("a"));
		

		/**
		 * String concat(String str) 将指定字符串连接到此字符串的结尾。
		 */
		String ret = "AA".concat("BB");
		System.out.println(ret);// "AA" + "BB";

		
		/**
		 * boolean contains(CharSequence s) 当且仅当此字符串包含指定的 char 值序列时，返回 true。
		 */
		System.out.println("ABC".contains("AC"));
		
		
		/**
		 * boolean contentEquals(CharSequence cs) 将此字符串与指定的 CharSequence 比较。
		 */
		System.out.println("ABC".contentEquals("AB"));//
		
		
		/**
		 * boolean endsWith(String str) 测试此字符串是否以指定的后缀结束。
		 */
		System.out.println("ABC  ".endsWith("  "));
		
		
		/**
		 *  boolean equals(Object anObject) 
          			将此字符串与指定的对象比较。 
          			
          			"A".equals(1);
          			
          	boolean equalsIgnoreCase(String anotherString) 
          			将此 String 与另一个 String 比较，不考虑大小写。 
		 * */
		System.out.println("ABC".equals("abc"));
		System.out.println("A".equals(-1));
		
		
		/**
		 *  byte[] getBytes()  把String对象里的每一个值取出来放在一个byte数组里, 
		 * */
		byte[] bys = "ABC".getBytes();
		System.out.println(Arrays.toString(bys));
		
		byte b = 65;
		char c = (char) b;
		System.out.println(c);
		
		System.out.println(new String(bys,1,1));
		
		
		/**
		 *  int indexOf(int ch) 返回指定字符在此字符串中第一次出现处的索引。 
		 *  int indexOf(int ch, int fromIndex)  
		 * */
		System.out.println("ABCABCA".indexOf('B',8));
		
		
		/**
		 * 	int length():返回字符串中自字符的个数
		 *  boolean isEmpty() 
          		当且仅当 length() 为 0 时返回 true。 
		 * */
		System.out.println("   ".length());
		System.out.println("".isEmpty());//return this.length == 0;
		
		System.out.println("ABCDEDFABCD".lastIndexOf("A"));
		
		
		/**
		 *  String replace(char oldChar, char newChar) 
		          		返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
		 	String replace(CharSequence target, CharSequence replacement) 
		          		使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 
		 	String replaceAll(String regex, String replacement) 
		          		使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
		 * */
		System.out.println("ABCDA".replace('A', 'X'));
		System.out.println("AABCDAA".replace("AA", "XX"));
		
		
		/**
		 *  String[] split(String str)   把该字符串的内容按 str来分隔
		 */
		String fileExt = "java;txt;cpp;avi";
		
		String[] ss = fileExt.split(";");
		for (String string : ss) {
			System.out.println(string);
		}
		
		
		/**
		 * boolean startsWith(String prefix)  
		 */
		System.out.println("ASDFGABC".startsWith("AS"));
		
		
		/**
		 * Java里的区间 都是 前闭后开          [beginIndex, endIndex )
		 * CharSequence subSequence(int beginIndex, int endIndex) 
		          	返回一个新的字符序列，它是此序列的一个子序列。 
		 String substring(int beginIndex) 
		          	返回一个新的字符串，它是此字符串的一个子字符串。 
		 String substring(int beginIndex, int endIndex) 
		          	返回一个新字符串，它是此字符串的一个子字符串。 
		 * */
		CharSequence  seq = "ABCDEFG";//CharSequence是String的接口
		
		CharSequence  sub = seq.subSequence(3, 5);
		System.out.println(sub);//DE
		
		
		/**
		 * char[] toCharArray() 
          		将此字符串转换为一个新的字符数组。 
		 * */
		System.out.println(Arrays.toString("12345".toCharArray()));
		
		//String str = "s1234567S";
		//判断该str是否有 0~9的数字组成
		String str = "1234 567";
		System.out.println(isNum(str));
		
		System.out.println("ABC".toLowerCase());
		System.out.println("abc".toUpperCase());
		
		
		/**
		 *  String trim()    返回字符串的副本，忽略前导空白和尾部空白。 
		 * */
		System.out.println("  A B C  ".length());
		s = "  A B C  ".trim();
		System.out.println(s.length());//
		
	}
	
	/**
	 * 判断字符串是否全是数字
	 * @param s
	 * @return
	 */
	public  static boolean isNum(String s){
		char[] cs = s.toCharArray();
		for (char d : cs) {
			if(!(d >= '0' && d <= '9')){
				return false;
			}
		}
		return true;
	}
	public  static boolean isNum2(String s){
		char[] cs = s.toCharArray();
		for (char d : cs) {
			//static boolean isDigit(char ch) 确定指定字符是否为数字。
			if(!Character.isDigit(d)){
				//第一次遇见非数字的字符,就返回 false
				return false;
			}
		}
		return true;
	}
}
