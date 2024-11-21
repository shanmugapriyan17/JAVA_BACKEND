package com.string;

public class Test2 {
	
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		
		if(str1==str2) {
			System.out.println("same loc");
		}else {
			System.out.println("diff loc");
		}
		
		String str3 = new String("java");
		String str4 = new String("java");
		if(str3==str4) {
			System.out.println("same loc");
		}else {
			System.out.println("diff loc");
		}
		
		if(str3.equals(str4)) {
			System.out.println("same loc");
		}else {
			System.out.println("diff loc");
		}
		
		String s1 = "code";
		String s2 = new String("language");
		
		s2 = s1.intern();
		System.out.println(s2);
		
	}
}