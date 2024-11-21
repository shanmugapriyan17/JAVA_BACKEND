package com.controlStatement;

public class Test_3 {
	
	public String s1(int num3,int num4) {
		
		return (num3 > num4)? num3+"greater" :(num3 < num4)? num4+"greater" :"both are equal";
		
	}
	
	

	public static void main(String[] args) {
		Test_3 obj = new Test_3();
	    System.out.println(obj.s1(6, 6));
		

	}

}
