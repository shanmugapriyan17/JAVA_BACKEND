package com.controlStatement;



public class Test_5 {
	public void e1(int cel){
		if(cel<20) {
			System.out.println("Is cold");
			
		}else if (cel >= 20 && cel <= 30) {
			System.out.println("Is warm");
			
		}else{
			System.out.println("Is hot");
			
		}
		
	}

	public static void main(String[] args) {
		Test_5 obj = new Test_5();
		obj.e1(20);
		

	}

}
