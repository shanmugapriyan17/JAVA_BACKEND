package com.stringbuffer;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class code_I {
	
	public static void getFrequency(String str) {
		HashMap<Character,Integer> hs = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++){
			if(hs.containsKey(str.charAt(i))) {
				hs.put(str.charAt(i), hs.get(str.charAt(i))+1);
				
			}else {
				hs.put(str.charAt(i), hs.getOrDefault(str.charAt(i), 1));
			}
		}
		
		for
		
	}
	
	public static void main(String[] args) {
		String st = "encyclopedia";
		
		
		
    

}
