package in.basics;

import java.util.Arrays;

public class Max_EiNo {
	
	public static void FD (){
		int[][] arr1= {{3,4,5,7},{2,1,4,6},{15,7,9,3},{2,3,4,5}};
		int row1 = 0;
		int row2 = 0;
		int row3 = 0;
		int row4 = 0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				
				if(i==0){
					if(arr1[i][j]>row1) {
						row1 = arr1[i][j];
					}
				}
				else if(i==1) {
					if(arr1[i][j]>row2) {
						row2 = arr1[i][j];
						
					}
					
				}
				else if(i==2) {
					if(arr1[i][j]>row3) {
						row3 = arr1[i][j];
						
					}
					
				}
				else if(i==3) {
					if(arr1[i][j]>row4) {
						row4 = arr1[i][j];
				}
					
					
				}
				
			}
			
			
		}
		System.out.println(row1);
		System.out.println(row2);
		System.out.println(row3);
		System.out.println(row4);
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		Max_EiNo.FD();
		
		
	}

}
