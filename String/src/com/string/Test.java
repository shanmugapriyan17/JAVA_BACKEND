package com.string;

public class Test {

	public static void main(String[] args) {
		//concat = +
		//str += str1; = str.concat(str1);
		
		String str = "java";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		
		System.out.println(str.hashCode());
		str = str.concat("code");
		System.out.println(str);
		System.out.println(str.hashCode());
		
		
		System.out.println(str.hashCode());
	
		

	}

}
