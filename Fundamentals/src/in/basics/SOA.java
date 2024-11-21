package in.basics;

public class SOA {
	
	public static void DB(){
	   int[] arr= {6,7,5,4,3};
	   int SP=0;
	   for(int i=0;i<arr.length;i++) {
		   
		   SP+=arr[i];
		   
	   }
	   System.out.println(SP);
	}

	public static void main(String[] args) {
		
		SOA.DB();

	}

}