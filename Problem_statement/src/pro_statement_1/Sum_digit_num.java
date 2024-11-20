package pro_statement_1;

public class Sum_digit_num {
	
	public int Sum(int a) {
		System.out.println("The sum of the Digits:");
		int sum=0;
		while (a != 0) {
	       sum += a % 10;  	            
	       a = a / 10;    	        
	    }
		return sum;
	}

	public static void main(String[] args){
		Sum_digit_num obj = new Sum_digit_num();
		System.out.println(obj.Sum(8));
		
	}
}


