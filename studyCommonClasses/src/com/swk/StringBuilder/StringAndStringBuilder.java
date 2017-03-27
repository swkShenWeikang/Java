package com.swk.StringBuilder;


public class StringAndStringBuilder {
	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("AAA");
		StringBuilder sb2 = new StringBuilder("AAA");
		String s1 = "111";
		String s2 = "111";
		
		System.out.println(sb1);//AAA
		System.out.println(sb2);//AAA
		System.out.println(s1);//111
		System.out.println(s2);//111
		
		System.out.println("----------------------");
		
		replace(sb1, sb2, s1, s2);
		
		System.out.println("----------------------");
		
		System.out.println(sb1);//AAA
		System.out.println(sb2);//AAACCC
		System.out.println(s1);//111
		System.out.println(s2);//111
	}


	public static void replace(StringBuilder sb1,StringBuilder sb2,String s1,String s2){
		
//		System.out.println("-->"+s1);
//		System.out.println("-->"+s2);
//		
//		System.out.println("sb1" + sb1);
//		System.out.println("sb2" + sb2);
		
		sb1 = new StringBuilder("BBB");
		sb2.append("CCC");
		s1  = new String("222");
		String ret = s2.concat("333");//111333
		ret.trim();

		System.out.println(sb1);//BBB
		System.out.println(sb2);//AAACCC
		System.out.println(s1);//222
		System.out.println(s2);//111
	}
}
