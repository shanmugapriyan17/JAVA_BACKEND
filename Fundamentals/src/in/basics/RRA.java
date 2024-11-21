package in.basics;

import java.util.Arrays;

public class RRA {
	
	public static void RR() {
	 int[] arr= {1,2,3,4,5};
	 int LI = arr.length-1;
	 int[] arr2 = new int[arr.length];
	 
	 for(int i=0;i<arr.length;i++){
		 arr2[i] = arr[LI--]; 
	 }
	 
	 System.out.print(Arrays.toString(arr2));
	 
	}
	public static void main(String[] args) {
		RRA.RR();
		
	}
	
}