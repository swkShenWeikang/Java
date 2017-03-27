package com.swk.StringBuilder;


/**
 * String是不可变类，一旦String对象被创建，包含在对象中的字符序列是不可变的，直到对象被销毁
 * StringBuffer与StringBuilder的字符序列是可变的(通过append等方法操作)
 *
 * StringBuffer：  是线程安全的；
 * StringBuilder： 是线程不安全的，性能高点，推荐使用
 */
public class StringBuilderDemo {
	
	
	public  StringBuilderDemo  ooxx(){
		
		return this;
	}
	
	public static void main(String[] args) {
		
		//new StringBuilderDemo().ooxx().ooxx().ooxx();
		
		StringBuilder sb = new StringBuilder();//""
		sb = new StringBuilder("abc");
		System.out.println(sb.toString());
		
		/**
		 * 
		 * String  和 StringBuilder的转换
		 * 
		 * 	String  --> StringBuilder
		 * 
		 * 	StringBuilder --> String
		 * 
		 * StringBuilder   --- StringBuffer
		 * 
		 */
		new StringBuilder(new StringBuffer("OOXX"));
		
		/*sb.append(false);
		sb.append("SpringBrother");
		sb.append("SpringBrother");
		sb.append("SpringBrother");*/
		
		sb.append(false).append("SpringBrother").append("SpringBrother")
		.append("SpringBrother").append("SpringBrother").append("SpringBrother")
		.append("SpringBrother").append("SpringBrother").append("SpringBrother");
		
		System.out.println(sb);
		
		
		/**
		 * StringBuffer  区别: synchronized关键字
		 * StringBuilder delete(int start, int end) 
		          	移除此序列的子字符串中的字符。 
		   StringBuilder deleteCharAt(int index) 
		                                移除此序列指定位置上的 char。 
		 * */
		sb = new StringBuilder("ABCDEFG");
		sb.delete(2, 4);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);//BEFG
		
		
		/**
		 * StringBuilder insert(int offset, Object obj) 
          		将 Object 参数的字符串表示形式插入此字符序列中。 
          		
          		数组有length方法吗?  
          			数组只有过后length属性,
		 */
		
		sb.insert(1, false);
		System.out.println(sb);
		
		/**
		 * StringBuilder reverse() 将此字符序列用其反转形式取代。 
		 * */
		
		sb.reverse();
		System.out.println(sb);
		
		String str = "ABCDEFG";// GFEDCBA
		
		System.out.println(reverse(str));
		
		
		/**
		 *  void setCharAt(int index, char ch) 
			          将给定索引处的字符设置为 ch。 
			void setLength(int newLength) 
			          设置字符序列的长度。 
		 * */
		System.out.println("-->"+sb);
		System.out.println(sb.charAt(1));
		sb.setCharAt(1, 'O');
		System.out.println(sb.charAt(1));
		
		sb.setLength(100);
		System.out.println(sb.length());
		System.out.println(sb);
		
		
	}
	
	public static String reverse(String oldStr){
		/*StringBuilder sb = new StringBuilder();
		char[] cs = oldStr.toCharArray();
		for (int i = cs.length -1; i >=0 ; i--) {
			sb.append(cs[i]);
		}
		return sb.toString();*/
		
		return new StringBuilder(oldStr).reverse().toString();
	}
}
