package com.controlStatement;

public class Test_4 {
	public String vow(String x) {
		if(x =="a" || x =="e" || x =="i" || x =="o" || x =="u") {
			return "its vowel";
		}
		else {
			return "its consonant";
		}
	}

	public static void main(String[] args) {
		Test_4 obj = new Test_4();
		System.out.println(obj.vow("b"));
		
		
	}
}
