package in.basics;

public class Allpossible {
    
	public static void AB(int h){
		int[] arr={5,4,6,3,2};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==h){
					System.out.println(arr[i]+" ,"+arr[j]);
					
				}
			}
			
		}
	
		
		
	}
	public static void main(String[] args) {
		Allpossible.AB(6);

	}

}
