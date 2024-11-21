package com.twodimenstional;

public class Find_max_no_one {
	
	public static void ROW () {
		int[][] arr1 = {{1,0,0},{1,1,1},{1,1,0}};
		
		int r1=0;
		int r2=0;
		int r3=0;
		for(int i=0;i<arr1.length;i++) {
			for(int s=0;s<arr1[i].length;s++) {
					if(i==0) {
					if(arr1[i][s]==1){
						r1++;
						}
					}
					else if(i==1){
						if(arr1[i][s]==1) {
							r2++;
						}
					}
					else {
						if(arr1[i][s]==1) {
							r3++;
							
						}
					}
				
			}
		}
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}

	public static void main(String[] args) {
		Find_max_no_one.ROW();
		
		
		
		
	}

}
