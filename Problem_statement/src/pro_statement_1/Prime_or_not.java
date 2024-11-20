package pro_statement_1;

public class Prime_or_not {
	public String P_O_N(int a) {
		if(a<=1) {
			return "not a prime";
		}
		else {
			for(int i=2;i<=Math.sqrt(a);i++) {
				if(a%i==0) {
					return "not a prime";
				}
				
			}
		}
		return "prime";
		}


	public static void main(String[] args) {
		Prime_or_not obj = new Prime_or_not();
		System.out.println(obj.P_O_N(7));
		

	}

}
