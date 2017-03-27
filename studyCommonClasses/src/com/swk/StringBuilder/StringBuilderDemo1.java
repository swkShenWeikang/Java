package com.swk.StringBuilder;

public class StringBuilderDemo1 {

	public static void insertStr(){
		StringBuilder sb = new StringBuilder("ABCDEFGHI");
		sb.deleteCharAt(sb.length() - 1);
		for(int i = 1; i < sb.length(); i += 2){
			sb.insert(i, ',');
		}
		
		System.out.println(sb);
	}
	
	public static void appendStr(){
		int[] arr = {1,2,3,4,5,6,7,8};
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			str.append(arr[i]).append(',');
		}
		str.deleteCharAt(str.length() - 1);
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		insertStr();
		
		appendStr();
	}

}
