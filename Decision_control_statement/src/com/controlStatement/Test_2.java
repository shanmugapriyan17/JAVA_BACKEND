package com.controlStatement;

public class Test_2 {
	
	public void s1(int num1,int num2) {
		if(num1>num2) {
			System.out.println("positive");
			
		}if (num1<num2) {
			System.out.println("negative");
			
		}else { 
			System.out.println("zero");
			
		}
	}
	

	public static void main(String[] args) {
		Test_2 obj = new Test_2();
		obj.s1(5, 6);
		

	}

}
