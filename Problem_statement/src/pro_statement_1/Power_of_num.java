package pro_statement_1;

public class Power_of_num {
	
	 public int P_N(int base, int exp) {
			System.out.println(base +" power "+ exp +" is :");

	        int result = 1;

	        for (int i = 1; i <= exp; i++) {
	            result *= base;
	        }

	        return result;
	    }


	public static void main(String[] args) {
		
		Power_of_num obj=new Power_of_num();
		System.out.println(obj.P_N(6, 9));

	}

}
