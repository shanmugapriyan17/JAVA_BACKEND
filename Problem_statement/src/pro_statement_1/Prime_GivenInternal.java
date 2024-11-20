package pro_statement_1;

public class Prime_GivenInternal {
	
	 public boolean P_G(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public Integer Sum_P(int a, int b) {
			System.out.println("--------------------------------");
			System.out.println("the sum of prime between the interval "+a+" and "+b+ " is :");

	        int sum = 0;
	        int temp;

	        
	        if (a > b) {
	            temp = a;
	            a = b;
	            b = temp;
	        }

	        
	        for (int i = a; i <= b; i++) {
	            if (P_G(i)) {
	                sum += i;  
	            }
	        }

	        return sum;
	    }

	  

	public static void main(String[] args) {
		
		 Prime_GivenInternal obj = new  Prime_GivenInternal();
		 System.out.println(obj.P_G(4));
		 
		 Prime_GivenInternal obj1 = new  Prime_GivenInternal();
		 System.out.println(obj1.Sum_P(6, 15));
		 
		 
		 
		 
		 
	
		 
		
		
		
		

	}

}
