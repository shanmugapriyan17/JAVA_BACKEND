package in.basics;

public class Sort_row {
	
	public static void AB() {
		int[][] arr1 = {{4,5,6},{6,8,2},{4,8,1}};
		
		int min = 0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				if(min < arr1[i][j]){
					   arr1[i][j] = min;
					   System.out.print(arr1[i][j]);
					   
					
				}
				else {
					System.out.println("no");
					
				}
			}
			System.out.println();
			
			
		}
		
	}
	
	public static void main(String[] args) {
		Sort_row.AB();
		
	
		
		

	}
	

}


