package com.string;

public class Test3 {

	public static void main(String[] args) {
		
		
		String str6 = "i like programmming";
		
		String[] word = str6.split(" ");
		
		String[] rearrange = new String[word.length];
		rearrange[0] = word[2];
		rearrange[1] = word[0];
		rearrange[2] = word[1];
		
		
		String re = String.join(" ", rearrange);
		
		System.out.println("rearrange:"+ " "+ re);
			
			
		}
		
		
		

	}


