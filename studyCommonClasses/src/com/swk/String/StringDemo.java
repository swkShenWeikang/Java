package com.swk.String;

public class StringDemo {
	
	
	/**
	 *  单独使用""引号创建的字符串都是常量,编译期就已经确定存储到常量池中；
	 *  使用new String("")创建的对象会存储到堆内存中,是运行期新创建的；
	 *  使用只包含常量的字符串连接符如"aa" + "bb"创建的也是常量,编译期就能确定,已经确定存储到常量池中；
	 *  使用包含变量的字符串连接符如"aa" + s1创建的对象是运行期才创建的,存储在堆中；
	 */
	public static void main(String[] args) {
		
		/*
		 *  "" 其实表示的是  String的匿名对象
		 */
		String s = "";
		/**
		 * String()   初始化一个新创建的 String 对象，使其表示一个空字符序列。
		 * 
		 *  "",不是表示 null
		 *  
		 *  String(String original) 
		 *  
		 *  String s = new String("asd");// s 的值就是 asd
		 */
		s = new String();//""
		System.out.println(s);
		
		String s1  = new String("11");
		String s2  = new String("11");
		System.out.println(s1 == s2);//false
		
		String s3 = "22";
		String s4 = "22";
		System.out.println(s3 == s4);//true
		
		System.out.println(s3 == s2);//false
		
		
		
		String  s5 = "2" + "2";//这句话其实在编译器编译后的class文件中 已经变成  "22"
		
		//s5创建了几个对象? 1
		
		System.out.println(s3 == s5);//true
		
		/**
		 * 
		 * String 特点:  	不可变的,  一个String对象的内容不能变,一旦内容变量该对象就变成一个新的String对象了
		 * 
		 * 	String  str = "AAA";
		 * 
		 * 	str = str+"12";
		 */
		String str = "A" +"B"+ "C" +"D" +"E";//String str = "ABCDE";
		
		String str1 = "ABCDE";
		System.out.print("--");
		System.out.println(str == str1);//true
		
		String str2 = "ABC" + "DE";
		System.out.println(str == str2);//true
		
		String  ss = "AB";
		String str3 = ss + "CDE";//这里的str3在运行期才能确定内容值
		
		System.out.println(str3 == str2);//false
		
		String str4 = getStr() +"CDE";//在运行期才能确定 str4的值
		
		System.out.println(str == str4);//false
		
		/*
		 *
		 *  String s = "cd";	//一个String对象
			s = s + "itcast";	//itcast也是String对象, 最后的s的值cditcast,也是一个String对象
			System.out.print(s);
		 * */
	}
	
	public static String getStr(){
		return "AB";
	}
}
