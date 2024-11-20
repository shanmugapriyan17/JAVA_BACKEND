package in.basics;

public class Snake_form {
	
	public static void snake() {
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0;i<arr1.length;i++) {
			int s = arr1[i].length;
			for(int j=0;j<arr1[i].length;j++) {
				
				if (i%2==0){
					
					System.out.print(arr1[i][j]);		
				}
				else if(i%2==1) {				
					s--;
					System.out.print(arr1[i][s]);
				}
				
			}
			System.out.println();	
		}
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		
		
		Snake_form.snake();
		
		

	}
	

}
